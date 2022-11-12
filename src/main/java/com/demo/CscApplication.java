package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CscApplication {

         public static final String Rest_Url="www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(CscApplication.class, args);
	}
        
        //Custmer Details
       public void doCustInfo(){


       }

}
