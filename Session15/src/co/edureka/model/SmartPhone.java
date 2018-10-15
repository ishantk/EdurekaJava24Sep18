package co.edureka.model;

public class SmartPhone extends Phone{ // IS-A Relationship -> SmartPhone IS A Phone
	
	// Attributes
	String os;
	Integer ram;
	Integer storage;
	
	public SmartPhone() {
	
	}

	public SmartPhone(String os, Integer ram, Integer storage) {
		this.os = os;
		this.ram = ram;
		this.storage = storage;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "SmartPhone [os=" + os + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
}
