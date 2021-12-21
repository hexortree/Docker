package com.example.demo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/provider")
public class InsuranceproviderApplication {

	@GetMapping("/getplan")
	public List<String> getPlans(){
		return Stream.of("a","b","c").collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(InsuranceproviderApplication.class, args);
	}

}
