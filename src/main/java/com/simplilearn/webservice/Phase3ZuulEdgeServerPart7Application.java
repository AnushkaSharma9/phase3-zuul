package com.simplilearn.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase3ZuulEdgeServerPart7Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3ZuulEdgeServerPart7Application.class, args);
	}

}
