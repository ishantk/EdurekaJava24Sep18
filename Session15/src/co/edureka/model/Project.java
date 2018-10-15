package co.edureka.model;

public class Project {
	
	// Attributes
	Integer pid;
	String technology;
	Integer timeToFinish;

	public Project() {
	
	}

	public Project(Integer pid, String technology, Integer timeToFinish) {
		this.pid = pid;
		this.technology = technology;
		this.timeToFinish = timeToFinish;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Integer getTimeToFinish() {
		return timeToFinish;
	}

	public void setTimeToFinish(Integer timeToFinish) {
		this.timeToFinish = timeToFinish;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", technology=" + technology + ", timeToFinish=" + timeToFinish + "]";
	}
}
