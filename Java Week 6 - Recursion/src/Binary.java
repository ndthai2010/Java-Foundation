package src;
import java.util.Scanner;

public class Binary {

	public static String convertBinary(int n) {
		String res = "";
		int temp;
		while (n > 0) {
			temp = n % 2;
			res = temp + res;
			n = n / 2;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.println(convertBinary(n));
	}

}
