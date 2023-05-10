package src;

import java.util.Scanner;

public class SortArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static void sortArray(int a[]) {
		int temp = a[0];
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	
	public static void showArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = sc.nextInt();
		int[] array = new int[n];
		inputArray(array);
		sortArray(array);
			System.out.println("Mang sap xep theo thu tu: ");
		showArray(array);
	}
}
