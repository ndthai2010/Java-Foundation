package src;

import java.util.Scanner;

public class SumDiagonal {

	public static Scanner sc = new Scanner(System.in);
	
	public static int[][] inputMatrix(){
			System.out.print("rows: ");
		int rows = sc.nextInt();
			System.out.print("cols: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("[" + i + "," + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static int sumElements(int[][] a){
		int rows = a.length;
		int cols = a[0].length;
		int sum = 0;
		if(rows == cols) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					if(i == j)
						sum += a[i][j];
				}
			}
		}
		return sum;
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
		int[][] m1 = inputMatrix();
		printMatrix(m1);
		System.out.print("Tong cac phan tu cua matrix: " + sumElements(m1));
	}


}
