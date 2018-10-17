package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	// Dependency 
	CA ca; // HAS-A Relationship
	
	public CB() {
	
	}

	//@Autowired
	public CB(CA ca) {
		System.out.println("==Constructor Injection==");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		System.out.println("==Setter Injection==");
		this.ca = ca;
	}
	
	public void hello(String name){
		ca.sayHello(name);
	}
	
}
