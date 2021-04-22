package com.example.Practice13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Practice13Application {

	@Value("${student.name}")
	private String studentName;
	@Value("${student.last_name}")
	private String studentLastname;
	@Value("${student.group}")
	private String studentGroup;
	@Value("${student.sName}")
	private String secondStudentName;
	@Value("${student.sLastname}")
	private String secondStudentLastname;

	public static void main(String[] args) {
		SpringApplication.run(Practice13Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println(studentName);
		System.out.println(studentLastname);
		System.out.println(studentGroup);
		System.out.println("--------------------");
		System.out.println(secondStudentName);
		System.out.println(secondStudentLastname);
	}

}
