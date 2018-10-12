package co.edureka.model;

// Model or Bean or POJO (Plain Old Java Object)
public class Employee {
	
	// Attributes for Employee Object
	int eid;
	String name;
	String email;
	int salary;
	String designation;

	public Employee() {
	
	}

	public Employee(int eid, String name, String email, int salary, String designation) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
}
