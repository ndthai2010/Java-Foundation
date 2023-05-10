package src;

import java.util.Scanner;

public class PerfectArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static void inputArray(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("array[" + i +"] = ");
			a[i]= sc.nextInt(); 
		}
	}
	
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				sum = sum + i;
		}
		
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void findPerfect(int a[]) {
		for(int i : a) {
			if(isPerfect(i))
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
			System.out.print("n = ");
		int n = sc.nextInt();
		int [] array = new int [n];
		inputArray(array);
			System.out.print("Cac so hoan hao la: ");
		findPerfect(array);
	}

}
