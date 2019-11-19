package com.epam.trainings.java.springbootdemo2.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Dog {

  @NonNull
  String name;

}
