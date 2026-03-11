package com.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class ServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void openApiDocsAreExposed() throws Exception {
		mockMvc.perform(get("/api-docs"))
			.andExpect(status().isOk())
			.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.openapi").value("3.1.0"))
			.andExpect(jsonPath("$.info.title").value("JSB Service Catalog API"))
			.andExpect(jsonPath("$.info.version").value("v1"));
	}

	@Test
	void swaggerUiIsExposed() throws Exception {
		MvcResult result = mockMvc.perform(get("/swagger-ui.html"))
			.andReturn();

		assertThat(result.getResponse().getStatus()).isLessThan(400);
		assertThat(result.getResponse().getRedirectedUrl()).contains("/swagger-ui");
	}

}
