package com.demo.pal;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class PalApplication {

	
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(PalApplication.class);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(PalApplication.class, args);
		// openHomePage();
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
