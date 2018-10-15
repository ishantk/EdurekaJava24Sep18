package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Mike");
		person.setEmail("mike@example.com");
		
		Address address = new Address();
		address.setAdrsLine("Pristine Magnum");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		// One to One Relationship between Person and Address
		person.setAddress(address);
		address.setPerson(person);

		// Hibernate API's
		Configuration config = null;
		SessionFactory factoy = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parse hibernate.cfg.xml file
			
			factoy = config.buildSessionFactory(); // Obtain SessionFactory from Configuration
			
			session = factoy.openSession(); // Open Session shall create a connection to the DB with mentioned details. 
			
			session.save(person); // Saving person will also save address, making aid same as pid 
			
			transaction = session.beginTransaction();
			transaction.commit();
			
			System.out.println("==Transaction Done==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
			
			//transaction.rollback();
			
		}finally{
			
			if(session!=null){
				session.close();
			}
			
			if(factoy!=null){
				factoy.close();
			}
		}
		

	}

}
