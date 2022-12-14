package com.idat.ReservaMService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfGiovanniRomeroReservaMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfGiovanniRomeroReservaMServiceApplication.class, args);
	}

}
