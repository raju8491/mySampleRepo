package com.sumit.playjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class MyAppApplication {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/app")
	public String getApp() {
		return "you are in  port number : "+port;
	}
	
	@GetMapping("/country")
	public String getConuntry() {
		return "India";
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return "Active";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
