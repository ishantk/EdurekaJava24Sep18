package co.edureka.model;

/*
	SQL Commands:
	Table:
	create table Employee(
		id int primary key auto_increment,
		name varchar(256),
		phone varchar(20),
		dept varchar(256),
		salary int
	)
	
	Insert:
	insert into Employee values(null,'John','+91 98989 98989','R&D',70000)
	insert into Employee values(null,'Fionna','+91 88989 88989','HR',50000)
	
	Update:
	update Employee set name = 'John Watson', phone = '+91 98888 78888', salary = 77500 where id = 1
	
	Delete
	delete from Employee where id = 2 
	
	Select -> Get the data from Table as rows !!
	select * from Employee
	select * from Employee where salary > 60000
	
 */

public class Employee {

	// Attributes for Employee Object
	public int id;
	public String name;
	public String phone;
	public String dept;
	public int salary;

	public Employee() {
	
	}

	public Employee(int id, String name, String phone, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	
}
