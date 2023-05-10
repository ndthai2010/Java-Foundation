package src;

import java.util.Scanner;

public class MultiMatrix {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[][] inputMatrix(int rows, int cols, Scanner sc){
		int[][] matrix = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] multiMatrix(int[][] a, int[][] b){
		int rowA = a.length;
		int colB = b[0].length;
		int[][] multi = new int[rowA][colB];
		for(int i = 0; i < rowA; i++) {
			for(int j = 0; j < colB; j++) {
				for(int k = 0; k < rowA; k++) {
					multi[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return multi;
	}
	
	public static void printMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("Rows: ");
		int rows = sc.nextInt();
			System.out.print("Cols: ");
		int cols = sc.nextInt();
		int[][] m1 = inputMatrix(rows, cols, sc);
		printMatrix(m1);
		int[][] m2 = inputMatrix(rows, cols, sc);
		printMatrix(m2);
		int[][] result = new int[rows][cols];
		result = multiMatrix(m1, m2);
			System.out.println("Tich 2 ma tran: ");
		printMatrix(result);
	}

}
