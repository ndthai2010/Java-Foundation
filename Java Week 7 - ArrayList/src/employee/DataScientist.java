package src.employee;

public class DataScientist extends Employee {
	private int projects;
	private static final double value = 1500;
	
	
	public DataScientist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataScientist(String id, String name, int year, double salary) {
		super(id, name, year, salary);
		// TODO Auto-generated constructor stub
	}

	public int getProjects() {
		return projects;
	}

	public void setProjects(int projects) {
		this.projects = projects;
	}
	
	public DataScientist(String id, String name, int year, double salary, int projects) {
		super(id, name, year, salary);
		this.projects = projects;
	}

	public double computeSalary() {
		return super.getSalary() + projects * value;
	}

	@Override
	public String toString() {
		return "DataScientist [Id = " + getId() + ", Name = " + getName() + ", Year = " + getYear()
				+ ", Projects =" + projects + ", Salary = " + computeSalary() + "]";
	}

	
	
	
}
