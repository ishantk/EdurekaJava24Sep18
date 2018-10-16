package co.edureka.bean;

public class DBConnection {

	// Attributes for DB Connection
	String url;
	String userName;
	String password;
	String driver;
	
	public DBConnection() {
		System.out.println("==DBConnection Object Constructed==");
	}

	public DBConnection(String url, String userName, String password, String driver) {
		System.out.println("**DBConnection Object Constructed**");
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	// myInit and myDestroy can be any names of your choices !!
	public void myInit(){
		System.out.println(">>DBConnection Initialized<<");
	}
	
	public void myDestroy(){
		System.out.println(">>DBConnection Destroyed<<");
	}

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", userName=" + userName + ", password=" + password + ", driver=" + driver
				+ "]\nObject HashCode: "+super.toString();
	}
}
