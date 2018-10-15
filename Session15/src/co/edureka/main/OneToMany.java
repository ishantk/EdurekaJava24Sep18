package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Manager;
import co.edureka.model.Project;

public class OneToMany {

	public static void main(String[] args) {
		
		
		Project project1 = new Project(null, "AWS", 5);
		Project project2 = new Project(null, "Android", 1);
		Project project3 = new Project(null, "iOS", 2);
		
		Project project4 = new Project(null, "Angular", 2);
		Project project5 = new Project(null, "JEE", 3);
		
		List<Project> list1 = new ArrayList<>();
		list1.add(project1); //0
		list1.add(project2); //1
		list1.add(project3); //2
		
		List<Project> list2 = new ArrayList<>();
		list2.add(project4); //0
		list2.add(project5); //1
		
		Manager mgr1 = new Manager();
		mgr1.setName("George");
		mgr1.setSalary(80000);
		mgr1.setExperience(8);
		mgr1.setEmail("george@example.com");
		mgr1.setProjects(list1); // Has-A Relationship
		
		Manager mgr2 = new Manager();
		mgr2.setName("Fionna");
		mgr2.setSalary(100000);
		mgr2.setExperience(10);
		mgr2.setEmail("fionna@example.com");
		mgr2.setProjects(list2); // Has-A Relationship

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
			
			//session.save(mgr1);
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println(mRef);
			
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
