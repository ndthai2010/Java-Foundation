package src;

import java.util.Scanner;

public class SumCols {

	public static Scanner sc = new Scanner(System.in);

	public static int[][] inputMatrix(int m, int n, Scanner sc){
		int[][] matrix = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	public static void sumCols(int[][] a) {
		int cols = a[0].length;
		int[] b = new int[cols];
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				b[i] += a[j][i];
			}
			System.out.print(b[i] + " ");
		}
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
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] m1 = inputMatrix(m, n, sc);
		sumCols(m1);
	}
}
