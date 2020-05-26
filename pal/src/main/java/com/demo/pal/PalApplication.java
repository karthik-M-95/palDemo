package com.demo.pal;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.web.session.HttpSessionEventPublisher;

@SpringBootApplication()
@ComponentScan(basePackages = "com.demo.pal")
public class PalApplication {

	
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(PalApplication.class);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(PalApplication.class, args);
		// openHomePage();
	}

	@Bean
	public HttpSessionEventPublisher httpSessionEventPublisher() {
		return new HttpSessionEventPublisher();
	}
	
//	 private static void openHomePage() {
//	        try {
//	            URI homepage = new URI("http://localhost:8080/pal/Login");
//	            Desktop.getDesktop().browse(homepage);
//	        } catch (URISyntaxException | IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
	
}
