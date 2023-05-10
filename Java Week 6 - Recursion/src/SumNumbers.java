package src;

import java.util.Scanner;

public class SumNumbers {

	public static Scanner sc = new Scanner(System.in);
	
	public static void printNum() {
		int sum = 0;
		for(int i = 0; i <= 4; i++) {
			System.out.print("Nhap vao mot so: ");
			int n = sc.nextInt();
		}
	}
	
	public static int calculateSum() {
		int sum = 0;
		for(int i = 1; i <= 4; i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum();
			System.out.print("Tong 5 so vua nhap la: " + calculateSum());
	}

}
