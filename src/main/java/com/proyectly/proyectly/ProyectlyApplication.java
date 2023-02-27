package com.proyectly.proyectly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProyectlyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProyectlyApplication.class, args);
	}
}
