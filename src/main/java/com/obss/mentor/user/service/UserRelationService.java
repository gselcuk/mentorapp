package com.obss.mentor.user.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.obss.mentor.user.constants.RelationPhase;
import com.obss.mentor.user.model.UserRelation;
import com.obss.mentor.user.repository.UserRelationRepository;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@Component
public class UserRelationService {
  @Autowired
  private UserRelationRepository userRelationRepository;

  /**
   * Create relation between given users.
   * 
   * @param userRelation
   * @return
   */
  public Mono<UserRelation> createRelation(UserRelation userRelation) {

    if (StringUtils.isEmpty(userRelation.getUserRelationId()))
      userRelation.setRelationPhase(RelationPhase.STARTED);

    return userRelationRepository.save(userRelation);

  }

}
