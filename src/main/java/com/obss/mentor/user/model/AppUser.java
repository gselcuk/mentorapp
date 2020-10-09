package com.obss.mentor.user.model;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import lombok.Builder;
import lombok.Data;


/**
 * 
 * @author Goktug Selcuk
 *
 */
@Document
@Data
@Builder
public class AppUser {

  @Id
  @GeneratedValue(strategy = UNIQUE)
  private String id;
  private String userName;
  private boolean isAdmin;
  private String userRole;
  private List<Long> groupIds;

}
