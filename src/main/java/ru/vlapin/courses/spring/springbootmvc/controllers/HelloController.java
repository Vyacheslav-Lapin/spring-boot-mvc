package ru.vlapin.courses.spring.springbootmvc.controllers;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("pages")
public class HelloController {

  @GetMapping("hello")
  @Contract(pure = true)
  public final @NotNull String hello(
      @NotNull @RequestParam(defaultValue = "World", required = false) String name,
      @NotNull Model model) {

    model.addAttribute("name", String.format("Hello, %s!", name));

    return "hello";
  }


}
