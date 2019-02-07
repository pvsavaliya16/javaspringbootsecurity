package com.argus.hibernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HibernateDemoApplication extends SpringBootServletInitializer{

        
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
            return applicationBuilder.sources(HibernateDemoApplication.class);
        }
    
	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

}

