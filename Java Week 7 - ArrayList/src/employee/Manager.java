package src.employee;

public class Manager extends Employee {

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, int year, double salary) {
		super(id, name, year, salary);
		// TODO Auto-generated constructor stub
	}
	
	public double computeSalary() {
		return super.getSalary() * 1.25;
	}

	@Override
	public String toString() {
		return "Manager [Id = " + getId() + ", Name = " + getName() + ", Year = " + getYear()
				+ ", computeSalary() = " + computeSalary() + "]";
	}

}
