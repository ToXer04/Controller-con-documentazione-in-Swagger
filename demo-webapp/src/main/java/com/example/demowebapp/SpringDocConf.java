package com.example.demowebapp;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConf {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(info());
    }
    private Info info(){
        return new Info()
                .title("Demo WebApp")
                .description("Created Swagger")
                .version("0.0.1")
                ;
    }
}