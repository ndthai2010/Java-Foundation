package src;

import java.util.Scanner;

public class PrintMatrix {
	
	public static Scanner sc = new Scanner(System.in);
	public static int[][] inputMatrix() {
			System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
			System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
			System.out.println("Enter the value for each element of matrix: ");
			
		int[][] matrix = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;	
	}
	
	public static void outputMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) { 
				System.out.print(a[i][j] + " ");
			}
				System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = inputMatrix();
		outputMatrix(matrix);
	}

}
