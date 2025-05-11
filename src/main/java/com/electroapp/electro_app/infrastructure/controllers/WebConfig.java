package com.electroapp.electro_app.infrastructure.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://127.0.0.1:5500", "http://localhost:5500") // ambos orígenes
                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS") // AGREGA OPTIONS
                        .allowedHeaders("*")
                        .allowCredentials(true); // opcional, si usas cookies o auth
            }
        };
    }
}
