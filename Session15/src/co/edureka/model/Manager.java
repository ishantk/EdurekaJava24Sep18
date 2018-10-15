package co.edureka.model;

import java.util.List;

public class Manager {
	
	Integer mid;
	String name;
	Integer salary;
	Integer experience;
	String email;
	
	List<Project> projects; // Has-A Relationship - One Manager having Many Projects
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, Integer salary, Integer experience, String email, List<Project> projects) {
		this.mid = mid;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
		this.email = email;
		this.projects = projects;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", salary=" + salary + ", experience=" + experience
				+ ", email=" + email + ", projects=" + projects + "]";
	}

}
