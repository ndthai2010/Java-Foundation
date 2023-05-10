package src;

import java.util.Scanner;

public class EvenNumber {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int n, Scanner sc) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static void checkArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = sc.nextInt();
		int[] m1 = inputArray(n, sc);
		checkArray(m1);
	}

}
