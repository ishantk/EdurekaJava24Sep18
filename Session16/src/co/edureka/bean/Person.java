package co.edureka.bean;

import java.util.List;

public class Person {

	String name;
	String email;
	Address address; // Has-A
	
	List<String> certificates;
	
	// We are constructing Address Object when Person Object will be constructed
	// Dependency with high Coupling
	public Person(){
		//address = new Address();
	}
	
	// Coupling is Reduced
	public Person(Address address){
		System.out.println("==DI with Constructor==");
		this.address = address;;
	}

	// Coupling is Reduced
	public void setAddress(Address address){
		System.out.println("==DI with Setter==");
		this.address = address;;
	}

	public Person(String name, String email, Address address) {
		this.name = name;
		this.email = email;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		System.out.println("DI with Setter for List");
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
