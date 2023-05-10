package src.computer;
import java.util.Scanner;

import src.computer1.Computer1;
import src.computer1.ComputerTest1;

public class ComputerTest {
	private Computer1 computers[];
	private int n;
	
	private static Scanner sc = new Scanner(System.in);
	public void input(Scanner sc)
	{
			System.out.println("n = ");
		this.n = Integer.parseInt(sc.nextLine());
		computers = new Computer1[n];
		
		for(int i = 0; i < n; i++) {
				System.out.print("Name: ");
			String name = sc.nextLine();
				System.out.print("Manu: ");
			String manu = sc.nextLine();
				System.out.print("Detail: ");
			String detail = sc.nextLine();
				System.out.print("Year: ");
			int year = Integer.parseInt(sc.nextLine());
				System.out.print("Price: ");
			double price = Double.parseDouble(sc.nextLine());
			
			computers[i] = new Computer1(name, manu, year, detail, price);
		}
	}
	
	
	public void output()
	{
		for(int i = 0; i < n; i++) {
			System.out.println(computers[i].toString());
		}
	}
	
	
	public double getAvgPrice()
	{
		double price = 0.0, avg = 0.0;
		for(int i = 0; i < n; i++) {
			price += computers[i].getPrice();
		}
		avg = price / computers.length;
		return avg;
	}
	
	public void getMaxPrice()
	{
		double max = 0;
		for(int i = 0; i < n; i++) {
			if(max < computers[i].getPrice())
				max = computers[i].getPrice();
		}
		for(int i = 0; i < n; i++) {
			if(computers[i].getPrice() == max)
				System.out.println(computers[i].toString());
		}
	}
	
	public void getDell()
	{
		for(int i = 0; i < n; i++) {
			if(computers[i].getManu().equals("Dell")) {
				System.out.println(computers[i].toString());
			}
				
		}
	}
	
	public void sort()
	{
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(computers[i].getPrice() < computers[j].getPrice()) {
					Computer1 temp = computers[i];
					computers[i] = computers[j];
					computers[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(computers[i].toString());
		}
	}
	
	public static void main(String[] args) {
		ComputerTest computer = new ComputerTest();
		computer.input(sc);
		computer.output();
		System.out.println(computer.getAvgPrice());
		computer.getMaxPrice();
		computer.getDell();
		computer.sort();
	}
}
