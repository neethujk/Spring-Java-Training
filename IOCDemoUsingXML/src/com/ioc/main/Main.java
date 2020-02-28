package com.ioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.system.Company;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Company company = (Company) ac.getBean("abc");
		company.establish("ABC Private Limited");
		company = (Company) ac.getBean("xyz");
		company.establish("XYZ corporation");
	}

}
