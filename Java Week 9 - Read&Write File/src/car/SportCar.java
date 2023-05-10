package src.car;

public class SportCar extends Car {
	private double tax;
	
	public SportCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportCar(String id, String name, String manufacturer, double hours, double price, double tax) {
		super(id, name, manufacturer, hours, price);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public double getAmount() {
		return super.getPrice() * super.getHours() + ((super.getPrice() * super.getHours() * tax) / 100.0);
	}
	
	@Override
	public String toString() {
		return "SportCar [id=" + getId() + ", name=" + getName() + ", manufacturer=" + getManufacturer() + ", hours=" + getHours() + ", price="
				+ getPrice() + ", tax = " + tax + "]";
	}
}
