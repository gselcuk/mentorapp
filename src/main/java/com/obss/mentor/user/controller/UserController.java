package com.obss.mentor.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.obss.mentor.user.model.AppUser;
import com.obss.mentor.user.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Controller class for user operations.
 * 
 * @author Goktug Selcuk
 *
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * Authenticate service.
   * 
   * @return
   */
  @PostMapping(value = "/authenticate")
  public Mono<AppUser> authenticate() {
    return userService.authenticate();
  }

  /**
   * Insert given {@code AppUser} to database.
   * 
   * @return
   */
  @PostMapping(value = "/upsert")
  @ResponseStatus(HttpStatus.OK)
  public Mono<AppUser> upsert(@RequestBody AppUser appUser) {
    return userService.upsertUser(appUser);
  }

  /**
   * 
   * @param appUser
   * @return
   */
  @PostMapping(value = "set/role/mentorgroupleader")
  public void setMentorGroupLeader(@RequestBody AppUser appUser) {
     userService.setMentorGroupLeader(appUser);
  }

  /**
   * Get {@code AppUser} for given id.
   * 
   * @param id Given id as path variable.
   * @return
   */
  @GetMapping(value = "/get/{id}")
  public Mono<AppUser> getUserById(@PathVariable String id) {
    return userService.getUserById(id);
  }

  /**
   * Get all users in database.
   * 
   * @return
   */
  @GetMapping(value = "get/all")
  public Flux<AppUser> getAllUsers() {
    return userService.getAllUsers();
  }

}
