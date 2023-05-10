package src;

import java.util.Scanner;

public class Triangle {

	static boolean isTriangle(double a, double b, double c)
    {
        // begin edit 
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
			return true;
		}else {
			return false;
		}
        //end edit
    }
    static double getArea(double a, double b, double c)
    {
        // begin edit 
        if(isTriangle(a, b, c)) {
        	double p = (a + b + c) / 2;
        	double Area = Math.sqrt((p - a) * (p - b) * (p - c));
        	return Area;
        }else {
        	return 0;
        }
        //end edit         
    }
    
    static double getPerimeter(double a, double b, double c)
    {
        // begin edit 
        if(isTriangle(a, b, c)) {
        	double Perimeter = a + b + c;
        	return Perimeter;
        }else {
        	return 0;
        }
        //end edit         
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        	System.out.print("a = ");
        double a = sc.nextDouble();
        	System.out.print("b = ");
        double b = sc.nextDouble();
        	System.out.print("c = ");
        double c = sc.nextDouble();
        	System.out.println("Area = " + Math.round(getArea(a, b, c) * 100.0) / 100.0);
        	System.out.println("Perimeter = " + Math.round(getPerimeter(a, b, c) * 100.0) / 100.0);
    }

}
