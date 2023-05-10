package src.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

	public static Scanner sc = new Scanner(System.in);
	
	public static void inputEmployee(ArrayList<Employee> employs) {
		
			System.out.print("Number of employees: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
				System.out.println("Option 0: Employee");
				System.out.println("Option 1: Manager");
				System.out.println("Option 2: Developer");
				System.out.println("Option 3: Data Scientist");
			int option = Integer.parseInt(sc.nextLine());
				System.out.print("ID:");
			String id = sc.nextLine();
				System.out.print("Name: ");
			String name = sc.nextLine();
				System.out.print("Year: ");
			int year = Integer.parseInt(sc.nextLine());
				System.out.print("Salary: $");
			double salary = Double.parseDouble(sc.nextLine());
			
			switch (option) {
			case 0:
				Employee e = new Employee(id, name, year, salary);
				employs.add(e);
				break;
			case 1: 
				Employee m = new Manager(id, name, year, salary);
				employs.add(m);
				break;
			case 2:
					System.out.print("Projects: ");
				int projects = Integer.parseInt(sc.nextLine());
				Employee d = new Developer(id, name, year, salary, projects);
				employs.add(d);
				break;
			case 3:
					System.out.print("Projects: ");
				int projects1 = Integer.parseInt(sc.nextLine());
				Employee s = new DataScientist(id, name, year, salary, projects1);
				employs.add(s);
				break;
			default:
				break;
			}
		}
	}
	
	public static void outputEmployee(ArrayList<Employee> employs) {
		for(int i = 0; i < employs.size(); i++) {
			System.out.println(employs.get(i).toString());
		}
	}
	

	public static void maxSalary (ArrayList<Employee> employs){
		double max = employs.get(0).getSalary();
		for(int i = 0; i < employs.size(); i++) {
			if(max < employs.get(i).getSalary()) {
				max = employs.get(i).getSalary();
			}
		}
		for(int i = 0; i < employs.size(); i++) {
			if(max == employs.get(i).getSalary())
				System.out.println(employs.get(i).toString());
		}
		
	}
	
	public static void maxProjects (ArrayList<Employee> employs){
		ArrayList<Developer> develops = new ArrayList<Developer>();
		for(int i = 0; i < employs.size(); i++) {
			if(employs.get(i) instanceof Developer) {
				develops.add((Developer) employs.get(i));
			}
				
		}
		double max = develops.get(0).getProjects();
		for(int i = 0; i < develops.size(); i++) {
			if(max < develops.get(i).getProjects()) {
				max = develops.get(i).getProjects();
			}
		}
		for(int i = 0; i < develops.size(); i++) {
			if(max == develops.get(i).getProjects())
				System.out.println(develops.get(i).toString());
		}
		
	}
	
	public static void sortYear(ArrayList<Employee> employs) {
		int n = employs.size();
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				if(employs.get(i).getYear() < employs.get(j).getYear()) {
					Employee temp = employs.get(i);
					employs.set(i, employs.get(j));
					employs.set(j, temp);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(employs.get(i).toString());
		}
	}
	
	public static void main(String args[]) {
		ArrayList<Employee> employs = new ArrayList<Employee>();
		inputEmployee(employs);
			System.out.println("\n List of employees: ");
		outputEmployee(employs);
			System.out.println("\n Employee with max salary: ");
		maxSalary(employs);
			System.out.println("\n Dvelopers with max projects: ");
		maxProjects(employs);
			System.out.println("\n List of employees sorted by ages: ");
		sortYear(employs);
	}
}
