package src.books;

public class ReferenceBook extends Book {
	
	private double tax;
	
	public ReferenceBook() {
		super();
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price, double tax) {
		super(id, name, quantity, publisher, price);
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
		// TODO Auto-generated method stub
		return super.getAmount() + tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}
