package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.*;

@SpringBootApplication
public class AwsPracticeApplication implements RequestHandler<Object, CustomResponse> {

	public static void main(String[] args) {
		SpringApplication.run(AwsPracticeApplication.class, args);
	}

	@Override
	public CustomResponse handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		System.out.println("WeLcome to IOMEDIA");
		
		CustomResponse custom = new CustomResponse("OK", 200, Collections.singletonMap("X-Powered-By", "TechPrimers"), false);
		return custom;
	}

}
