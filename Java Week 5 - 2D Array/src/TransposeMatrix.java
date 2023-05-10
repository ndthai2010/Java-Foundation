package src;

import java.util.Scanner;

public class TransposeMatrix {

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

	public static int[][] transposeMatrix(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int[][] transpose = new int[n][m];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				transpose[j][i] = a[i][j];
			}
		}
		return transpose;
	}

	public static void printMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sumCols(int[][] a) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("Rows: ");
		int m = sc.nextInt();
			System.out.print("Cols: ");
		int n = sc.nextInt();
		
		int[][] m1 = inputMatrix(m, n, sc);
		printMatrix(m1);
		
		int[][] result = transposeMatrix(m1);
			System.out.println("Trans: ");
		printMatrix(result);
	
	}

}
