package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Address;
import co.edureka.bean.Child;
import co.edureka.bean.DBConnection;
import co.edureka.bean.Father;
import co.edureka.bean.Person;

public class App {

	public static void main(String[] args) {
		
		
		// Traditionally we create Objects like this:
		/*DBConnection con1 = new DBConnection("jdbc:mysql://localhost/edureka", "root", "pass123", "com.mysql.jdbc.Driver");
		
		DBConnection con2 = new DBConnection();
		con2.setUrl("jdbc:mysql://localhost/customers");
		con2.setUserName("root");
		con2.setPassword("");
		con2.setDriver("com.mysql.jdbc.Driver");
		
		System.out.println("===========================");
		System.out.println(con1);
		System.out.println("===========================");
		System.out.println(con2);
		System.out.println("===========================");*/
		
		// Spring FW: IOC
		// Do not create objects, just configure them in XML File
		// Use IOC Container i.e. either BeanFactory or ApplicationContext
		
		// 1. IOC Container : BeanFactory
		/*Resource resource = new ClassPathResource("beans.xml"); // Parsing of XML File
		BeanFactory factory = new XmlBeanFactory(resource);     // Create IOC Container
		
		// When we request IOC Container BeanFactory by executing getBean, then BeanFactory will create Objects for us
		DBConnection cRef1 = (DBConnection)factory.getBean("conID1");
		DBConnection cRef2 = factory.getBean("conID2",DBConnection.class);
		System.out.println("===========================");
		System.out.println(cRef1);
		System.out.println("===========================");
		System.out.println(cRef2);
		System.out.println("===========================");*/
		
		//2. IOC Container : ApplicationContext
		
		// When we request IOC Container BeanFactory by executing getBean, then BeanFactory will create Objects for us.
		// But here we need not to execute getBean method, ApplicationContext will create the objects automatically, without the call to getBean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//DBConnection cRef1 = (DBConnection)context.getBean("conID1");
		//DBConnection cRef2 = context.getBean("conID1",DBConnection.class);
		//System.out.println("===========================");
		//System.out.println(cRef1);
		//System.out.println("===========================");
		//System.out.println(cRef2);
		//System.out.println("===========================");
		
		
		//Father father = context.getBean("fRef",Father.class);
		//System.out.println(father);
		
		//Child child = context.getBean("cRef",Child.class);
		//System.out.println(child);
		
		Person person = context.getBean("pRef",Person.class);
		System.out.println(person);
		
		System.out.println(person.getCertificates());
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
		/*Person pRef = new Person();
		Address aRef = new Address();
		pRef.setAddress(aRef);
	
		Address aRef2 = new Address();
		Person pRef1 = new Person(aRef2);*/
	
	

		
		
	}

}
