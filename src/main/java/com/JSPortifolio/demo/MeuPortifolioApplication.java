package com.JSPortifolio.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.JSPortifolio.Controlles")
public class MeuPortifolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPortifolioApplication.class, args);
	}

}
