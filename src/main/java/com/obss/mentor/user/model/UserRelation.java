package com.obss.mentor.user.model;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import com.obss.mentor.user.constants.RelationPhase;
import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@Document
@Builder
@Data
public class UserRelation {

  @Id
  @GeneratedValue(strategy = UNIQUE)
  private String userRelationId;
  private List<AppUser> users;
  private RelationPhase relationPhase;

}
