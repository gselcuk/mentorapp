package com.obss.mentor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.obss.mentor.model.AppUser;
import com.obss.mentor.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * Controller class for user operations.
 * 
 * @author Goktug Selcuk
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * Authenticate service.
   * 
   * @return
   */
  @GetMapping(value = "/authenticate")
  public ResponseEntity<String> authenticate() {
    return ResponseEntity.ok("Success");
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
