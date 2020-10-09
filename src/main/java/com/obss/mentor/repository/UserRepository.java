package com.obss.mentor.repository;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import com.obss.mentor.model.AppUser;

/**
 * User data access layer.
 * 
 * @author Goktug Selcuk
 *
 */
@Repository
public interface UserRepository extends ReactiveSortingRepository<AppUser, String> {



}
