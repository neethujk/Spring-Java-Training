package com.ioc.system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Qualifier("tasks")
@Component("production")
@Order(3)
public class Production implements Process {

	@Override
	public void process(String name) {
		// TODO Auto-generated method stub
		System.out.println("Producing " + name);
	}

}
