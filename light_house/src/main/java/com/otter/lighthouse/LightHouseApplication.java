package com.otter.lighthouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@ComponentScan(basePackages = "com.otter.lighthouse")
public class LightHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LightHouseApplication.class, args);
	}

}
