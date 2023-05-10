package src.employee;

public class Employee {
	
	private String id, name;
	private int year;
	private double salary;
	
	public Employee(String id, String name, int year, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.salary = salary;
	}

	public Employee() {
		super();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", year=" + year + ", salary=" + salary + "]";
	}

	public double computeSalary() {
		return salary;
	}
	
}
