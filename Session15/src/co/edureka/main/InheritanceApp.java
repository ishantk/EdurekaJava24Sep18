package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.AndroidPhone;
import co.edureka.model.Phone;
import co.edureka.model.SmartPhone;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setName("iPhoneX");
		phone.setCompanyName("Apple");
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setName("Blackberry");
		smartPhone.setCompanyName("RIM");
		smartPhone.setOs("Blackberry");
		smartPhone.setRam(1);
		smartPhone.setStorage(32);
		
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.setName("Galaxy Note");
		androidPhone.setCompanyName("Samsung");
		androidPhone.setOs("Android");
		androidPhone.setRam(2);
		androidPhone.setStorage(64);
		androidPhone.setVersion(5);
		androidPhone.setVersionName("Lolipop");
		
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
			
			session.save(phone); 			// discriminator-value -> PHONE
			session.save(smartPhone);		// discriminator-value -> SMARTPHONE
			session.save(androidPhone); 	// discriminator-value -> ANDROIDPHONE
			
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
