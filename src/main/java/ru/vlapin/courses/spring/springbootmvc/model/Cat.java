package ru.vlapin.courses.spring.springbootmvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Cat {

  @JsonProperty("old")
  int age;
  String name;
}
