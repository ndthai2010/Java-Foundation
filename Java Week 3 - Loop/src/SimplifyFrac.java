package src;

import java.util.Scanner;

public class SimplifyFrac {

	public static void printSimplest(int Nume, int Denom) {
		int uoc = 0;
		int Tu = Math.abs(Nume);
		int Mau = Math.abs(Denom);
		for(int i = 1; i <= Mau; i++) {
			if(Tu % i == 0 && Mau % i == 0)
				uoc = i;
		}
		if(Denom > 0) {
			Tu = Nume / uoc;
			Mau = Denom / uoc;
			
		}else {
			Tu = -Nume / uoc;
			Mau = -Denom / uoc;
		}
		System.out.println(Tu +"/"+ Mau);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.print("Nume = ");
		int Nume = sc.nextInt();
			System.out.print("Denom = ");
		int Denom = sc.nextInt();
		printSimplest(Nume,Denom);
	}

}
