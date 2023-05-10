package src;

import java.util.Scanner;

public class XoaPhanTu {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static int[] deleteArray(int a[], int t) {
		for(int i = 0; i < a.length; i++) {
			if(i < t) {
				a[i] = a[i];
			}else {
				a[i] = a[i + 1];
			}
		}
		return a;
	}
	public static void printArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[n - 1];
		inputArray(array1);
		deleteArray(array2, n - 1);
			System.out.println("New array: ");
		printArray(array2);
	}

}
