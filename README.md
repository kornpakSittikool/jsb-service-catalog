# Swagger Example

This repository now includes a minimal Swagger/OpenAPI setup for the Spring Boot service in `service/`.

## What was added

- `springdoc-openapi-starter-webmvc-ui` is used to generate OpenAPI docs and Swagger UI.
- The app exposes a sample endpoint at `/api/greetings/hello`.
- OpenAPI metadata is configured in `service/src/main/java/com/example/service/config/OpenApiConfig.java`.

## Run

From `service/`:

```powershell
.\mvnw.cmd spring-boot:run
```

## Try it

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/api-docs`
- Sample endpoint: `http://localhost:8080/api/greetings/hello?name=Korn`
