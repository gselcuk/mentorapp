package com.obss.mentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.obss.mentor.model.AppUser;
import com.obss.mentor.repository.UserRepository;
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

}
