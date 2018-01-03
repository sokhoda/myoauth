package com.example.myoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
class MyoauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyoauthApplication.class, args);
	}
}
