package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CscApplication{

        private Map<String,Object> cache = new HashMap<String,Object>();

        public static final String Rest_Url="www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(CscApplication.class, args);
	}


        public void loadDataToCache(){
          
           //logic
         }
        
        //Custmer Details
       public void doCustInfo(){


       }

}
