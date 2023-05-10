package src;

import java.util.Scanner;

public class SumArray {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] inputArray(int n, Scanner sc) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("array[" + i +"] = ");
			array[i] = sc.nextInt();
		}
		return array;
		
	}
	
	public static int[] sumArray(int[] A, int[] B) {
		int[] C = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] + B[i];
		}
		return C;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("n = ");
		int n = sc.nextInt();
		int[] array1 = inputArray(n, sc);
		int[] array2 = inputArray(n, sc);
		int[] sum = new int[n];
		sum = sumArray(array1, array2);
		for(int i = 0; i < n; i++) {
			System.out.print(sum[i] + " ");
		}
		
	}

}
