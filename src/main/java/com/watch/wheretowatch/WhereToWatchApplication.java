package com.watch.wheretowatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class WhereToWatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereToWatchApplication.class, args);
	}

}
