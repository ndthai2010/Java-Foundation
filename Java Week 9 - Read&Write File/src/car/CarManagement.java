package src.car;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CarManagement {
	
	public CarManagement(){
		super();
	}
	
	public ArrayList<Car> readData(String fileName) {
		ArrayList<Car> list = new ArrayList<>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < n; i++) {
				int option = Integer.parseInt(sc.nextLine());
				String id = sc.nextLine();
				String name = sc.nextLine();
				String manufacturer = sc.nextLine();
				double hours = Double.parseDouble(sc.nextLine());
				double price = Double.parseDouble(sc.nextLine());
				
			switch (option) {
			case 0:
				double fee = Double.parseDouble(sc.nextLine());
				Car ser = new ServiceCar(id, name, manufacturer, hours, price, fee);
				list.add(ser);
				break;
			case 1:
				double tax = Double.parseDouble(sc.nextLine());
				Car spo = new SportCar(id, name, manufacturer, hours, price, tax);
				list.add(spo);
				break;
			default:
				break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public void printCars(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){
		ArrayList<Car> list = new ArrayList<>();
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getManufacturer().equals(manuName)) {
				list.add(cars.get(i));
			}
		}
		return list;
	}
	
	public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){
		double max = cars.get(0).getAmount();
		ArrayList<Car> list = new ArrayList<>();
		for(int i = 0; i < cars.size(); i++) {
			String[] checkStrings = cars.get(i).toString().split(" ");
			if(checkStrings[0].equals(typeOfCars)) {
				if(max < cars.get(i).getAmount())
					max = cars.get(i).getAmount();
			}
		}
		
		for(int i = 0; i < cars.size(); i++) {
			if(max == cars.get(i).getAmount()) {
				list.add(cars.get(i));
			}
		}
		return list;
	}
	
	public void sortByAmount(ArrayList<Car> cars){
		for(int i = 0; i < cars.size(); i++) {
			for(int j = i + 1; j < cars.size(); j++) {
				if(cars.get(i).getAmount() > cars.get(j).getAmount()) {
					Car temp = cars.get(i);
					cars.set(i, cars.get(j));
					cars.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		CarManagement carManag = new CarManagement();
		ArrayList<Car> cars = carManag.readData("data.txt");
		//	carManag.printCars(cars);
			
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i).getAmount() + " ");
		}
			System.out.println();
			ArrayList<Car> carsList = carManag.findCars(cars,"honda");
			carManag.printCars(carsList);
			
			ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
			carManag.printCars(carsList1);
			
			carManag.sortByAmount(cars);
			carManag.printCars(cars);
			
		}
}
