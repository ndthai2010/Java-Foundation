package src;

import java.util.Scanner;

public class DayTang {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int[] a) {
		for(int  i = 0; i < a.length; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	public static boolean checkArray(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i+1])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = sc.nextInt();
		int[] array = new int[n];
		inputArray(array);
		
		if(checkArray(array)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
