package src;

import java.util.ArrayList;
import java.util.Scanner;
public class ShapeTest{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Shape> readData()
	{
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
	    int n = Integer.parseInt(sc.nextLine());
	    for (int i = 0; i < n;i++)
	    {
	       String shape = sc.nextLine();
	       String[] letters = shape.split("\\s");
	       switch(letters[0])
	       {
	           case "c":
	               double cir = Double.parseDouble(letters[1]);
	               shapes.add(new Circle(cir));
	               break;
	           case "s":
	        	   double sq = Double.parseDouble(letters[1]);
	        	   shapes.add(new Square(sq));
	        	   break;
	           case "r":
	        	   double length = Double.parseDouble(letters[1]);
	        	   double width = Double.parseDouble(letters[2]);
	        	   shapes.add(new Rectangle(length, width));
	        	   break;
	           default: 
	        	   break;   
	       }
	    }
		return shapes;
	}
	
	
	public static Circle getMaxCircle(ArrayList<Shape> shapes)
	{
		boolean area = false;
		double max = 0;
		int temp = 0;
		for (int i = 0;i < shapes.size();i++)
		{ 
			if (shapes.get(i).getClass().getName().equals("Circle") == true)
			{
				if (max < shapes.get(i).getArea())
				{
					max = shapes.get(i).getArea();
					temp = i;
				}
				
				area = true;
			}
		}
		if (area == true)
		{
			return (Circle)shapes.get(temp);
		}
		else {
			return null;
		}
	
	}
	
	
	public static Square getMaxSquare(ArrayList<Shape> shapes)
	{
		boolean area = false;
		double max = 0;
		int temp = 0;
		for (int i = 0;i < shapes.size();i++)
		{ 
			if (shapes.get(i).getClass().getName().equals("Square") == true)
			{
				if (max < shapes.get(i).getArea())
				{
					max = shapes.get(i).getArea();
					temp = i;
				}
				
				area = true;
			}
		}
		if (area == true)
		{
			return (Square)shapes.get(temp);
		}
		else {
			return null;
		}
	

	}
	
	public static Rectangle getMaxRectangle(ArrayList<Shape> shapes)
	{
		boolean area = false;
		double max = 0;
		int temp = 0;
		for (int i = 0;i < shapes.size();i++)
		{ 
			if (shapes.get(i).getClass().getName().equals("Rectangle") == true)
			{
				if (max < shapes.get(i).getArea())
				{
					max = shapes.get(i).getArea();
					temp = i;
				}
				
				area = true;
			}
		}
		if (area == true)
		{
			return (Rectangle)shapes.get(temp);
		}
		else {
			return null;
		}
	
	}
	
	public static void main(String[] args){
		ArrayList<Shape> shapes = readData();
		sort(shapes);
		Circle c = getMaxCircle(shapes);
		Square s = getMaxSquare(shapes);
		Rectangle r = getMaxRectangle(shapes);
		if(c!=null)
		{
			System.out.printf("Circle %.2f\n",c.getArea());
		}
		else
		{
			System.out.println("Circle =  null");
		}
		if(s!=null)
		{
			System.out.printf("Square %.2f\n",s.getArea());
		}
		else
		{
			System.out.println("Square =  null");
		}
		
		if(r!=null)
		{
			System.out.printf("Rectangle %.2f\n",r.getArea());
		}
		else
		{
			System.out.println("Rectangle =  null");
		}

	}
	
	public static void sort(ArrayList<Shape> shapes){
		int n = shapes.size();
		
		for (int i = 0; i < n - 1; i++)
			for (int j = i+1; j < n; j++) {
				if((shapes.get(i)).compareTo(shapes.get(j)) > 0){
					Shape temp = shapes.get(i);
					shapes.set(i, shapes.get(j)); 
					shapes.set(j, temp);  
				}
			}
	}
}
