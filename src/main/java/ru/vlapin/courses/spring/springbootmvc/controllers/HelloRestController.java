package ru.vlapin.courses.spring.springbootmvc.controllers;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.courses.spring.springbootmvc.model.Cat;

@RestController
public class HelloRestController {

  @GetMapping("cat")
  @Contract(pure = true)
  public final @NotNull Cat getCat(
      @NotNull @RequestParam(defaultValue = "11", required = false) Integer age,
      @NotNull @RequestParam(defaultValue = "Мурка", required = false) String name) {

    return Cat.builder()
               .age(age)
               .name(name).build();
  }


}
