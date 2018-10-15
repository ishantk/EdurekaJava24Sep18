package co.edureka.model;

public class AndroidPhone extends SmartPhone{ // IS-A Relationship
	
	// Attributes
	Integer version;
	String versionName;
	
	public AndroidPhone() {
	
	}

	public AndroidPhone(Integer version, String versionName) {
		this.version = version;
		this.versionName = versionName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	@Override
	public String toString() {
		return "AndroidPhone [version=" + version + ", versionName=" + versionName + "]";
	}
}
