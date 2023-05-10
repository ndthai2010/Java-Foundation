package src;

import java.util.Scanner;

public class PalindromeArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int n, Scanner sc) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		return a;
	}
	
	public static boolean isPalindrome(int k) {
		int temp, rev = 0, original;
		original = k;
		while(k > 0) {
			temp = k % 10;
			rev = rev * 10 + temp;
			k = k / 10;
		}
		if(rev == original) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void findPalindrome(int a[]) {
		for(int k : a) {
			if(isPalindrome(k)) 
				System.out.print(k + " ");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = Integer.parseInt(sc.nextLine());
		int [] array = inputArray(n, sc);
			System.out.print("Cac so doi xung la: ");
		findPalindrome(array);
	}

}
