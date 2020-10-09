package com.obss.mentor.user.repository;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import com.obss.mentor.user.model.UserRelation;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@Repository
public interface UserRelationRepository extends ReactiveSortingRepository<UserRelation, String> {

}
