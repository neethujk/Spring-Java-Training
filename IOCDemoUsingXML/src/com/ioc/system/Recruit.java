package com.ioc.system;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Recruit implements Process{

	@Override
	public void process(String name) {
		// TODO Auto-generated method stub
		System.out.println("Recruitment for " + name);
	}
	
	

}
