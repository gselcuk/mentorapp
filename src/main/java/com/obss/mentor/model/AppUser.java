package com.obss.mentor.model;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import lombok.Data;


/**
 * 
 * @author Goktug Selcuk
 *
 */
@Document
@Data
public class AppUser {

  @Id
  @GeneratedValue(strategy = UNIQUE)
  private String id;
  private String name;

}
