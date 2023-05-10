package src.computer;

public class Computer {
	

	private String name, manu, detail;
	private int year;
	private double price;
	
	public Computer() {
	}
	
    public Computer(String name, String manu, int year, String detail, double price) {
		this.name = name;
		this.manu = manu;
		this.detail = detail;
		this.year = year;
		this.price = price;
	}
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManu() {
		return manu;
	}

	public void setManu(String manu) {
		this.manu = manu;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + " " + manu + " " + year + " " + detail + " " + price;
	}
}
