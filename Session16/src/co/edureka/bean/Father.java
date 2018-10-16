package co.edureka.bean;

public class Father {

	String fname;
	String lname;
	int wealth;
	
	public Father() {
		System.out.println("==Father Object Consctructed==");
	}

	public Father(String fname, String lname, int wealth) {
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", wealth=" + wealth + "]";
	}
	
}
