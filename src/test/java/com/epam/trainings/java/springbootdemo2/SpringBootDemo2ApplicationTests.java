package com.epam.trainings.java.springbootdemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jayway.jsonpath.JsonPath;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser(authorities = "ADMIN")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class SpringBootDemo2ApplicationTests {

	MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	@SneakyThrows
	@DisplayName("cats controller works correctly")
	void cats() {
		mockMvc.perform(MockMvcRequestBuilders.get("/cats"))
		    .andExpect(MockMvcResultMatchers.status().isOk())
		    .andExpect(MockMvcResultMatchers.content().contentType(MediaTypes.HAL_JSON_VALUE))
		    .andExpect(mvcResult -> assertEquals(6,
		        JsonPath.parse(mvcResult.getResponse().getContentAsString())
		            .<Integer>read("$.page.totalElements").intValue()));
	}
}
