package co.edureka.bean;

public class Address {
	
	String adrsLine;
	String city;
	
	public Address() {
	
	}

	public Address(String adrsLine, String city) {
		this.adrsLine = adrsLine;
		this.city = city;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + "]";
	}
	
}
