package com.light_house.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan("com.light_house.app.domain.entity")
@EnableJpaRepositories("com.light_house.app.infrastructure.repository")
@ComponentScan({"com.light_house.app.infrastructure.controller, com.light_house.app.infrastructure.repository, com.light_house.app.infrastructure.service", "com.light_house.app.config"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
