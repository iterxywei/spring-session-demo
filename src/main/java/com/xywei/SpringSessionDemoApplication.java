package com.xywei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 3600)
public class SpringSessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionDemoApplication.class, args);
	}

}
