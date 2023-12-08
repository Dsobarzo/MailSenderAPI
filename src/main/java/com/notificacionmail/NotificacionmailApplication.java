package com.notificacionmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class NotificacionmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificacionmailApplication.class, args);
	}
	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("https://apilab-backend-sandbox.up.railway.app/")  // Reemplaza con tu dominio permitido
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
					.allowCredentials(true);
		}
	}

}
