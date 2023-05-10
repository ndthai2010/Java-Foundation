package src;

public class SumCal {
	
	public static double calculate(int n)
	{
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += (double) 1/i;
		}
		return Math.round(sum * 100.0) / 100.0;
	}
	
	public static void main(String[] args) {	
		int n = Integer.parseInt(args[0]);
		System.out.println(calculate(n));
	}
}
