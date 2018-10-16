package co.edureka.bean;

public class Child extends Father{
	
	String companyName;
	int vehicles;
	
	public Child() {
		System.out.println("==Child Object Constructed==");
	}

	public Child(String companyName, int vehicles) {
		this.companyName = companyName;
		this.vehicles = vehicles;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Child [companyName=" + companyName + ", vehicles=" + vehicles + ", fname=" + fname + ", lname=" + lname
				+ ", wealth=" + wealth + "]";
	}
	
}
