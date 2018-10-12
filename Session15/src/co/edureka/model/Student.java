package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="ROLLNUM")
	Integer roll;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="AGE")
	Integer age;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="ADDRESS")
	String address;

	public Student() {
	
	}

	public Student(Integer roll, String name, Integer age, String email, String address) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	
}
