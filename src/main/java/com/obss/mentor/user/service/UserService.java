package com.obss.mentor.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import com.obss.mentor.user.constants.UserRole;
import com.obss.mentor.user.model.AppUser;
import com.obss.mentor.user.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * User service.
 * 
 * @author Goktug Selcuk
 *
 */
@Component
public class UserService {

  @Autowired
  private UserRepository userRepository;

  /**
   * Authenticate user.If user exist return its id;otherwise insert user to database.
   * 
   * @return
   */
  public Mono<AppUser> authenticate() {
    Mono<AppUser> user = userRepository.findUserByUserName(getUserName());
    return user.switchIfEmpty(userRepository.save(
        AppUser.builder().userName(getUserName()).isAdmin(false).userRole(UserRole.USER).build()));
  }

  /**
   * Save given user to database and return it.
   * 
   * @param appUser {@code AppUser}.
   * @return
   */
  public Mono<AppUser> upsertUser(AppUser appUser) {
    return userRepository.save(appUser);
  }

  /**
   * Get user with using id.
   * 
   * @param id Given id.
   * @return
   */
  public Mono<AppUser> getUserById(String id) {
    return userRepository.findById(id);
  }

  /**
   * Get all users in database.
   * 
   * @return
   */
  public Flux<AppUser> getAllUsers() {
    return userRepository.findAll();
  }

  /**
   * Get user name from security context.
   * 
   * @return
   */
  public String getUserName() {
    return SecurityContextHolder.getContext().getAuthentication().getName();
  }

}
