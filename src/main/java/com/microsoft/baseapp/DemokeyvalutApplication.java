package com.microsoft.baseapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class DemokeyvalutApplication {

	@GetMapping("/getkeyvault")
	public String getkeyvault() {
		return mySecret;
	}

	@Value("${mySecret:keyvault not configured}")
	private String mySecret = "defaultValue\n";

}
