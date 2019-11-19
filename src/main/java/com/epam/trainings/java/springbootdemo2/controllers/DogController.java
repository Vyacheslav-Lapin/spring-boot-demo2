package com.epam.trainings.java.springbootdemo2.controllers;

import com.epam.trainings.java.springbootdemo2.model.Dog;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

  Dog sharik = new Dog("Шарик");

  @SneakyThrows
  @GetMapping("/dog")
  public @NotNull Dog dog() {
    return sharik;
  }
}
