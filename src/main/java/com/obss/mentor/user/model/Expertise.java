package com.obss.mentor.user.model;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import lombok.Builder;
import lombok.Data;

/**
 * Expertise model.
 * 
 * @author Goktug Selcuk
 *
 */
@Document
@Data
@Builder
public class Expertise {

  @Id
  @GeneratedValue(strategy = UNIQUE)
  private String expertiseId;
  private String expertiseName;

}
