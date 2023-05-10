package src.books;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
	
	public Book[] readData(Scanner sc) {
		int n = Integer.parseInt(sc.nextLine());
		Book[] books = new Book[n];
		for(int i = 0; i < n; i++) {
			int option = Integer.parseInt(sc.nextLine());
			String id = sc.nextLine();
			String name = sc.nextLine();
			int quantity = Integer.parseInt(sc.nextLine());
			String publisher = sc.nextLine();
			double price = Double.parseDouble(sc.nextLine());
		
		switch (option) {
		case 0:
			double tax = Double.parseDouble(sc.nextLine());
			books[i] = new ReferenceBook(id, name, quantity, publisher, price, tax);
			break;
		case 1:
			boolean status = Boolean.parseBoolean(sc.nextLine());
			books[i] = new TextBook(id, name, quantity, publisher, price, status);
			break;
		default:
			break;
			}
		}
		return books;
	}

	public void printBooks(Book[] books) {
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
	}

	public ArrayList<Book> findBooks(Book[] books, String publisher) {
		ArrayList<Book> list = new ArrayList<>();
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPublisher().equals(publisher)) {
				list.add(books[i]);
			}
		}
		return list;

	}
	
	public double computeAverage(Book[] books, String typeOfBooks) {
		double price = 0.0, count = 0;
		for(int i = 0; i < books.length; i++) {
			String[] check = books[i].toString().split(" ");
			if(check[0].equals(typeOfBooks)) {
				price += books[i].getAmount();
				count++;
			}
		}
		return price / count;
	}

	public void sortByPrice(Book[] books) {
		for(int i = 0; i < books.length; i++) {
			for(int j = i + 1; j < books.length; j++) {
				if(books[i].getAmount() > books[j].getAmount()) {
					Book temp = books[j];
					books[j] = books[i];
					books[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	}
	
}
