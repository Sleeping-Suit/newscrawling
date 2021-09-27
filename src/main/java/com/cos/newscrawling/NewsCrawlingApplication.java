package com.cos.newscrawling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NewsCrawlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsCrawlingApplication.class, args);
	}

}
