package com.obss.mentor.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.obss.mentor.user.model.UserRelation;
import com.obss.mentor.user.service.UserRelationService;
import reactor.core.publisher.Mono;

/**
 * User relation services can be foud under this class.
 * 
 * @author Goktug Selcuk
 *
 */
@RestController
@RequestMapping(value = "user/relation")
public class UserRelationController {
  @Autowired
  private UserRelationService userRelationService;

  /**
   * 
   * @param userRelation
   * @return
   */
  @PostMapping(value = "/save")
  public Mono<UserRelation> saveRelation(@RequestBody UserRelation userRelation) {
    return userRelationService.saveRelation(userRelation);
  }

}
