package com.example.micro1.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "narcs")
@TypeAlias("narcs")
@Data
@Builder
public class Narc {
  @Id private String id;

  private String fullName;

  private Boolean isPenalized;
}
