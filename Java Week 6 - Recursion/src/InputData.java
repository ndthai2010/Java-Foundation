package src;

import java.util.Scanner;

public class InputData {

	public static Scanner sc = new Scanner(System.in);
	
	public static void calculateYear() {
		double year;
			System.out.print("Ti le hoan von ban dau: ");
		String input = sc.nextLine();
		
		try {
			double r = Double.parseDouble(input);
			if(r != 0) {
				year = 72 / r;
					System.out.println("Ban can " + (int) year + " nam de nhan doi so tien dau tu ban dau");
			}else {
				System.out.println("Du lieu nhap vao khong hop le.");
				calculateYear();
			}
		}catch (NumberFormatException e){
			System.out.println("Du lieu nhap vao khong hop le.");
			calculateYear();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateYear();
	}
}
