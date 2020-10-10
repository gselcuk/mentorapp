package com.obss.mentor.user.model;

import java.sql.Date;
import org.springframework.data.couchbase.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Document
@Builder
@Data
public class RelationHistory {

  private String userId;
  private Date userStartDate;
  private Date userEndDate;

}
