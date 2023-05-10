package src;

import java.util.Scanner;

public class SinCos {
	public static double sin(double x) 
	{
        double sum = 0;
        for (int i = 0; i < 13; i++) {
            double term = (Math.pow(x, i) / fac(i));
            if (i % 4 == 1)
                sum += term;
            if (i % 4 == 3)
                sum -= term;
        }
        return sum;
    }


	private static double fac(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static double cos(double x) 
	{
        double sum = 0;

        for (int i = 0; i < 8; i++) {
            double term = (Math.pow(x, i) / fac(i));
            if (i % 4 == 0)
                sum += term;
            if (i % 4 == 2)
                sum -= term;
        }
        return sum;
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			System.out.print("Input x = ");
		double x = sc.nextDouble();
			System.out.print("sin(x) = " + sin(x));
			System.out.print("cos(x) = " + cos(x));
	}
}
