package src;
import java.util.Scanner;

public class Distance {

	public static Scanner sc = new Scanner(System.in);

	public static double calculate() {
		double dodaiAB;
		System.out.print("x1 = ");
		double x1 = sc.nextInt();
		System.out.print("x2 = ");
		double x2 = sc.nextInt();
		System.out.print("y1 = ");
		double y1 = sc.nextInt();
		System.out.print("y2 = ");
		double y2 = sc.nextInt();

		dodaiAB = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		System.out.println(Math.round(dodaiAB * 100.0) / 100.0);
		return dodaiAB;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do dai AB = " + calculate());
	}

}
