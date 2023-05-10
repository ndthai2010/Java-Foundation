package src;

import java.util.Scanner;

public class SquareArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static void inputArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("array[" + i +"] = ");
			a[i]= Integer.parseInt(sc.nextLine()); 
		}
	}
	
	public static boolean isSquare(int n) {
		for(int i = 1; i < n; i++) {
			if(i * i == n)
				return true;
		}
		return false;
	}
	
	public static void findSquare(int a[]) {
		for(int i : a) {
			if(isSquare(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = Integer.parseInt(sc.nextLine());
		int [] array = new int [n];
		inputArray(array);
			System.out.print("Cac so chinh phuong la: ");
		findSquare(array);
	}
}
