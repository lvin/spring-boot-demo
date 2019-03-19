package com.example.demo;

import com.example.demo.service.pa.D;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		final ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		final D d = (D)run.getBean("dImpl1");
		d.func();


	}
}
