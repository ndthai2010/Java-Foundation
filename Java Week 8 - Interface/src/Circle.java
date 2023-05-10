package src;

public class Circle implements Shape{
	private double r; 

	public Circle(){
	}
	public Circle(double r){
		this.r = r;
	}
	
	public void setRadius(double r){
		this.r = r;
	}
	
	public double getRadius(){
		return r;
	}
	
	public double getDiameter(){
		return 2*r;
	}
	
	
	// Cai dat cac phuong thuc cua giao dien Shape
	public double getPerimeter(){
		return 2 * r * Math.PI;
	}
	
	public double getArea(){
		return r * r * Math.PI;
	}
	
	// Phuong thuc rieng tinh dien tich hinh vuong ngoai tiep hình tròn
	public double getFrameArea(){
		return 4 * r * r;
	}
	
	// Ghi đe phuong thuc default cua giao dien Shape
	public int compareTo(Shape shape){
		if(shape.getClass().getName().equals("Circle")){
			double radius = ((Circle)shape).getRadius();
			if(r > radius)
				return 1;
			else if(r == radius)
				return 0;
			else 
				return -1;
		}
			
		double frameArea = getFrameArea();
		if(frameArea > shape.getArea()) {
			return 1;
		}
		else if(frameArea == shape.getArea()) {
			return 0;
		}
		return -1;
	}  
	
}
