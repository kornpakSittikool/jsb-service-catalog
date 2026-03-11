package com.example.service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	OpenAPI serviceCatalogOpenApi() {
		return new OpenAPI()
			.info(new Info()
				.title("JSB Service Catalog API")
				.description("Example Spring Boot API documented with Swagger UI")
				.version("v1")
				.contact(new Contact()
					.name("Service Catalog Team")
					.email("korapatsittkool@gmail.com"))
				.license(new License()
					.name("Apache 2.0")
					.url("https://www.apache.org/licenses/LICENSE-2.0")));
	}

}
