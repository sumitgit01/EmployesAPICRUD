package com.codemyth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.codemyth.controller.EmployeeController;

@SpringBootApplication
@EnableWebMvc
//@ComponentScan(basePackages = "com.codemyth.controller, com.codemyth.repository, com.codemyth.model")
//@Configuration
public class EmployesApicrudApplication extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmployeeController.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(EmployesApicrudApplication.class, args);
	}

}
