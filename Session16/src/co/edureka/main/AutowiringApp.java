package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.CB;

public class AutowiringApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		CB cRef = context.getBean("cb",CB.class);
		cRef.hello("John");
	}

}
