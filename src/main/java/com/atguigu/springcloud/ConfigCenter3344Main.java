package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344Main {

	public static void main(String[] args) {
		System.out.println("111111");
		SpringApplication.run(ConfigCenter3344Main.class, args);
	}
}
