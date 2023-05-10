package src;

import java.util.Scanner;

public class MinMax {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static int findMax(int a[]) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	
	public static int findMin(int a[]) {
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(min > a[i])
				min = a[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = Integer.parseInt(sc.nextLine());
		int [] array = new int [n];
		inputArray(array);
			System.out.println("Phan tu lon nhat trong mang la: " + findMax(array));
			System.out.println("Phan tu nho nhat trong mang la: " + findMin(array));
	}

}
