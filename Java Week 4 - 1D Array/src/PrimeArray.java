package src;
import java.util.Scanner;

public class PrimeArray {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int n, Scanner sc) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i + "] = ");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		return a;
	}
	
	public static boolean isPrime(int n){
		int temp = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				temp++;
		}
		if(temp == 2)
			return true;
		else 
			return false;
	}
	
	public static void findPrime(int a[]) {
		for(int i : a) {
			if(isPrime(i)) 
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[]) {
			System.out.print("n = ");
		int n = Integer.parseInt(sc.nextLine());
		int [] array = inputArray(n, sc);
			System.out.print("Cac so nguyen to la: ");
		findPrime(array);
	}
}
