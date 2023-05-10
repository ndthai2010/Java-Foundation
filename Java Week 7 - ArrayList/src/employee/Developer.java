package src.employee;

public class Developer extends Employee {
	private int projects;
	private static final double value = 100;
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String id, String name, int year, double salary, int projects) {
		super(id, name, year, salary);
		this.projects = projects;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getProjects() {
		return projects;
	}
	public void setProjects(int projects) {
		this.projects = projects;
	}
	
	public double computeSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + projects * value;
	}
	@Override
	public String toString() {
		return "Developer [getId()=" + getId() + ", getName()=" + getName() + ", getYear()=" + getYear()
				+ ", getSalary()=" + getSalary() + ", projects=" + projects + "]";
	}
	
	
	
}
