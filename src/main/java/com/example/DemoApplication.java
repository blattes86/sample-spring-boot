package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public static double diviser(Integer a,Integer b)
    {
		if (b==0)
		{
			return 0;
		}
		return  a/b;
    }
}
