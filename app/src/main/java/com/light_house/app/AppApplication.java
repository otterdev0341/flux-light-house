package com.light_house.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableR2dbcRepositories("com.light_house.app.infrastructure.repository")
@EntityScan("com.light_house.app.domain.entity")
@ComponentScan({"com.light_house.app.infrastructure.controller, com.light_house.app.infrastructure.repository, com.light_house.app.infrastructure.service", "com.light_house.app.config"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
