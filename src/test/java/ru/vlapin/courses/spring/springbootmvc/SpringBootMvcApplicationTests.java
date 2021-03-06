package ru.vlapin.courses.spring.springbootmvc;

import static com.jayway.jsonpath.JsonPath.parse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.TEXT_HTML;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
//@org.springframework.security.test.context.support.WithMockUser(authorities = "ADMIN")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class SpringBootMvcApplicationTests {

  MockMvc mockMvc;

  @Test
  void contextLoads() {
  }

  @Test
  @SneakyThrows
  @DisplayName("page input params")
  void pageInputParamsTest() {
		mockMvc.perform(get("/pages/hello"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(TEXT_HTML + ";charset=UTF-8"));
  }

}
