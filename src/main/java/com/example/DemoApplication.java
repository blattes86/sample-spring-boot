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
	public static double diviser(Integer a,Integer b) throws Exception
    {
		if (b==0)
		{
			return 0;
		}
		if (b==1)
		{
			throw new Exception("bad value");
		}
		return  a/b;
    }
    /**
	 * C'est la methode qui sert a additionner
	 * @param a : c'es
	 * @param b : c'est le diviseur
	 * @return : c'est le resultat
     */
    public static Integer addition(Integer a,Integer b)
    {
		return a+b;
	}
   /**
	 * C'est la methode qui sert a soustraire
	 * @param a : c'es
	 * @param b : c'est le diviseur
	 * @return : c'est le resultat
     */
    public static Integer soustraire(Integer a,Integer b)
    {
		return a-b;
	}
	    public static Integer soustrairea(Integer a,Integer b)
    {
		return a-b;
	}
}
