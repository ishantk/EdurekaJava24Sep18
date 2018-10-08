package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Harry", "+91 98989 88888", "Sales", 50000);
		Employee emp2 = new Employee(6, "Leo Watson", "+91 77777 77777", "Sales", 70000);

		System.out.println(emp1);
		System.out.println(emp2);
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		//helper.insertEmployee(emp2);
		//helper.updateEmployee(emp2);
		//helper.deleteEmployee(3);
		/*ArrayList<Employee> emps = helper.getEmployees();
		for(Employee emp : emps){
			System.out.println(emp);
			System.out.println();
		}*/
		
		helper.executeProcedure(emp1);
		
		helper.closeConnection();
		
	}

}
