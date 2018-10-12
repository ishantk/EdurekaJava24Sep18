package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import co.edureka.model.Student;

public class AnnotationApp {

	public static void main(String[] args) {

		Student s1 = new Student(null, "Sia", 20, "sia@example.com", "Redwood Shores");
		Student s2 = new Student(null, "Jack", 21, "jack@example.com", "Pristine Magnum");
		
		
		// Hibernate API's
		AnnotationConfiguration config = null;
		SessionFactory factoy = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Parse hibernate.cfg.xml file
			
			factoy = config.buildSessionFactory(); // Obtain SessionFactory from Configuration
			
			session = factoy.openSession(); // Open Session shall create a connection to the DB with mentioned details. 
			
			transaction = session.beginTransaction();
			
			session.save(s1);
			session.save(s2);
			
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
