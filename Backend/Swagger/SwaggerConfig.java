package com.fotomoda.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

@Bean
public OpenAPI api(){

return new OpenAPI()

.info(

new Info()

.title("FotoModa API")

.description("API REST para gerenciamento de portfólio de fotografias de moda")

.version("1.0")

);

}

}