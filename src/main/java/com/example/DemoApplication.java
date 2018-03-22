package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/**
	 * C'est la methode qui sert a diviser
	 * @param a : c'est le dividende
	 * @param b : c'est le diviseur
	 * @return : c'est le resultat ou 0 si le diviseur est 0
	 */
	public static double diviser(Integer a,Integer b)
    {
		if (b==0)
		{
			return 0;
		}
		return  a/b;
    }
}
