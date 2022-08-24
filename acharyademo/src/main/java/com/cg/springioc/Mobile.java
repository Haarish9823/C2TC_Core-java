package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
	Airtel a = (Airtel)c.getBean("airtel");
	a.data();
	a.calling();
	
	Jio j = c.getBean("jio",Jio.class);
	j.data();
	j.calling();
	}

}
