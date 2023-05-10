package src;

import java.util.Scanner;

public class Statistic {
	
    public static int[] readArray(Scanner reader)
    {
    	int n = reader.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = reader.nextInt();
    	}
        return a;
    }
  
    public static double mean(int[] array)
    {
    	int sum = 0;
    	double average = 0.0;
    	for(int i = 0; i < array.length; i++) {
    		sum += array[i];
    	}
    	average = (double) sum / array.length;
        return average;
    }
    
    public static double variance(int[] array)
    {
        double temp = mean(array);
        double var = 0.0, mean = 0.0;
        for(int i = 0; i < array.length; i++) {
        	mean += (array[i] - temp) * (array[i] - temp);
        }
        var = mean / (array.length);
        return var;
    }
    
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] array = readArray(reader);
        System.out.printf("%.3f\n",mean(array));
        System.out.printf("%.3f",variance(array));
    }
    
}
