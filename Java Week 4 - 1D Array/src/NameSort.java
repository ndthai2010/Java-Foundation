package src;

import java.util.Scanner;

public class NameSort {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		sc.nextLine();
		
		String studentNames[] = new String[n];
		for(int i = 0; i < n; i++) {
			studentNames[i] = sc.nextLine();
		}
		
		String res;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(studentNames[j - 1].compareTo(studentNames[j]) > 0) {
					res = studentNames[j - 1];
					studentNames[j - 1] = studentNames[j];
					studentNames[j] = res;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.println(studentNames[i]);
	}
}
