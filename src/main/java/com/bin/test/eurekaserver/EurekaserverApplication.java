package com.bin.test.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
