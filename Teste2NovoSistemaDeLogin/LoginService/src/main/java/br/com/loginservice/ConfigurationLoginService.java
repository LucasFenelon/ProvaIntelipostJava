package br.com.loginservice;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class ConfigurationLoginService {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8080);
		SpringApplication.run(ConfigurationLoginService.class, args);
	}
}
