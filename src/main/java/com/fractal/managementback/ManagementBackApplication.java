package com.fractal.managementback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;

@SpringBootApplication
@EnableSwagger2
public class ManagementBackApplication {
	
	  @Bean
	  public Docket managementApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select() 
	        .apis(RequestHandlerSelectors.any()) 
	        .paths(PathSelectors.any()) 
	        .build();
	  }
	public static void main(String[] args) {
		SpringApplication.run(ManagementBackApplication.class, args);
	}

}
