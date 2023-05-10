package src;

import java.util.Scanner;

public class MultiplicationTable {

	public static void multiplicate() {
		for(int i = 0; i <= 12; i++) {
			for(int j = 0; j <= 12; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("---------------");
			System.out.println();
		}
	}
	
	
	public static void main(String args[]) {
		multiplicate();
	}
}
