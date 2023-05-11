package com.cnwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lenovo
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.tictok")
@ComponentScan(basePackages = "com.cnwy")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
