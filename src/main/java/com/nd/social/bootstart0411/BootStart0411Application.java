package com.nd.social.bootstart0411;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nd.social.controller")
public class BootStart0411Application {

	public static void main(String[] args) {
		SpringApplication.run(BootStart0411Application.class, args);
	}
}
