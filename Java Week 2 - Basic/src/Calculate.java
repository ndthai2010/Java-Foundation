package src;

import java.util.Scanner;
public class Calculate {

	public static boolean isTriangle(double a, double b, double c) {
		if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > b) {
			return true;
		}else {
			return false;
		}
	}
	
	public static double getPerimeter(double a, double b, double c) {
		if(isTriangle(a, b, c)) {
			double p = (a + b + c);
			return p;
		}else {
			return 0;
		}
	}
	
	public static double getArea(double a, double b, double c) {
		if(isTriangle(a, b, c)) {
			double p = (a + b + c) / 2;
			double Area = Math.sqrt(p * (p -a)*(p-b)*(p-c));
			return Area;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("a = ");
		double a = sc.nextDouble();
			System.out.print("b = ");
		double b = sc.nextDouble();
			System.out.print("c = ");
		double c = sc.nextDouble();
			System.out.println("Perimeter = " + getPerimeter(a, b, c));
			System.out.println("Area = " + getArea(a, b, c));
	}

}
