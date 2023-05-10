package src;

import java.util.Scanner;

public class SumMatrix {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[][] inputMatrix(int m, int n, Scanner sc){
		int[][] matrix = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] sumMatrix(int[][] a, int[][] b ){
		int m = a.length;
		int n = a[0].length;
		int[][] c = new int[m][n];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
			System.out.print("Rows: ");
		int m = sc.nextInt();
			System.out.print("Cols: ");
		int n = sc.nextInt();
		
		int[][] m1 = inputMatrix(m, n, sc);
		printMatrix(m1);
		int[][] m2 = inputMatrix(m, n, sc);
		printMatrix(m2);
		
		int[][] sum = sumMatrix(m1, m2);
			System.out.println("Sum of 2 matrixes:");
		printMatrix(sum);	
	}
}
