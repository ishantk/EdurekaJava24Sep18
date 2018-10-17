package co.edureka.bean;

// import org.springframework.aop.framework.ProxyFactoryBean; -> ProxyFactoryBean should be configured in XML File
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Order order = context.getBean("orderProxy",Order.class);
		//System.out.println("==Order Details==");
		//System.out.println(order);
		
		// Execute Core Business Logic
		// But here we must link before and after advice which we have created
		// We need to configure an API ProxyFactoryBean in beans.xml file
		
		// After ProxyFactoryBean is configured !!
		// For every method in Order, before and after will be executed
		order.processOrder("Office", "14:00", true);
	}

}
