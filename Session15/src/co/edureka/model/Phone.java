package co.edureka.model;

public class Phone {
	
	// Attributes
	Integer pid;
	String name;
	String companyName;
	
	public Phone() {
		
	}

	public Phone(Integer pid, String name, String companyName) {
		this.pid = pid;
		this.name = name;
		this.companyName = companyName;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", name=" + name + ", companyName=" + companyName + "]";
	}

}
