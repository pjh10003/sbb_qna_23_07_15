package com.exam.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {

		System.out.println("성공");
		SpringApplication.run(SbbApplication.class, args);
	}



}
