package com.obss.mentor.user.repository;

import org.springframework.data.couchbase.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import com.obss.mentor.user.model.AppUser;
import reactor.core.publisher.Mono;

/**
 * User data access layer.
 * 
 * @author Goktug Selcuk
 *
 */
@Repository
public interface UserRepository extends ReactiveSortingRepository<AppUser, String> {

  /**
   * Find user with given userName.
   * 
   * @param userName
   * @return
   */
  @Query("#{#n1ql.selectEntity} where #{#n1ql.filter} and userName = $userName")
  Mono<AppUser> findUserByUserName(@Param("userName") String userName);

  /**
   * Update user role given user.
   * 
   * @param id
   * @param userRole
   * @return
   */
  @Query("update #{#n1ql.bucket}  use keys $id set userRole = $userRole RETURNING *")
  Mono<AppUser> saveUserRole(@Param("id") String id, @Param("userRole") String userRole);
}
