package com.social.network.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class SocialNetworkUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialNetworkUsersApplication.class, args);
	}

}
