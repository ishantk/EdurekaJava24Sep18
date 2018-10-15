package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;
import co.edureka.model.Student;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(0, "John", "john@example.com", 100000, "General Manager");
		
		Employee emp2 = new Employee();
		emp2.setName("Mike");
		emp2.setEmail("mike@example.com");
		emp2.setSalary(80000);
		emp2.setDesignation("Associate Engineer");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		// Objects are created in RAM and they hold data temporarily !!
		// We need to persist them. We shall use Hibernate to persist Objects !!
		
		// Hibernate API's
		Configuration config = null;
		SessionFactory factoy = null;
		Session session = null;
		Session session2 = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parse hibernate.cfg.xml file
			
			factoy = config.buildSessionFactory(); // Obtain SessionFactory from Configuration
			
			session = factoy.openSession(); // Open Session shall create a connection to the DB with mentioned details. 
			//session2 = factoy.openSession(); // Multiple Sessions 
			
			transaction = session.beginTransaction();
			
			//1. Save/Insert Data in DB
			//session.save(emp1);
			//session.save(emp2);
			
			//2. Get/Retrieve Data from DB
			/*Employee emp = (Employee)session.get(Employee.class, 3); // 3 is eid !!
			System.out.println("==details==");
			System.out.println(emp);*/
			
			//3. Update Data in DB
			// Get the Object Retrieved First and then update the same !!
			/*emp.setName("John Watson");
			emp.setEmail("john.w@example.com");
			emp.setSalary(125000);
			emp.setDesignation("Director");
			session.update(emp);*/
			
			//4. Delete Object from DB
			/*Employee eRef = new Employee();
			eRef.setEid(1); // We wish to delete employee with eid as 1
			session.delete(eRef);*/
			
			//5. Get All / Retrieve All from DB
			// 5.1 HQL i.e. Hibernate Query Language
			//String hql = "From Employee";
			//String hql = "From Employee where salary > 70000";
			
			//session.createSQLQuery(); // Explore for managing SQL Raw Queries
			
			/*List<Employee> empList = session.createQuery(hql).list();
			for(Employee e : empList){
				System.out.println();
				System.out.println(e);
			}*/
			
			//5.2 Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 70000)); 
			List<Employee> empList = criteria.list();
			for(Employee e : empList){
				System.out.println();
				System.out.println(e);
			}*/
			
			//6. Batch Operation
			
			// 100 Student Objects are saved in session object whil will be processed as a batch when we will commit transaction
			/*for(int i=1;i<=100;i++){ // 1to 100 -> 100 times
				Employee emp = new Employee(0, "Employee"+i, "employee"+i+"@example.com", 20000+i, "SE");
				session.save(emp);
			}*/
			
			Employee e1 = (Employee)session.get(Employee.class, 1);
			Employee e2 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(e1);
			System.out.println(e2);
			
			System.out.println("==Re Reading same Objects within the same session==");
			
			Employee e3 = (Employee)session.get(Employee.class, 1);
			Employee e4 = (Employee)session.get(Employee.class, 2);
			
			System.out.println(e3);
			System.out.println(e4);
			
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
