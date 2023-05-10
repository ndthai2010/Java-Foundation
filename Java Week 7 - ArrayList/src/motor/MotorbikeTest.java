package src.motor;


import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeTest {

	public static Scanner sc = new Scanner(System.in);

	public static void inputMotorbike(ArrayList<Motorbike> motorbikes, int n) {
		for (int i = 0; i < n; i++) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			String manu = sc.nextLine();
			int quantity = Integer.parseInt(sc.nextLine());
			double price = Double.parseDouble(sc.nextLine());
			double weight = Double.parseDouble(sc.nextLine());
			String date = sc.nextLine();

			motorbikes.add(new Motorbike(id, name, manu, quantity, price, weight, date));
		}
	}

	public static void outputMotorbike(ArrayList<Motorbike> motorbikes) {
		for (int i = 0; i < motorbikes.size(); i++) {
			System.out.println(motorbikes.get(i).printMotorbike());
		}
	}

	public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes) {
		ArrayList<Motorbike> list = new ArrayList<Motorbike>();
		for (int i = 0; i < motorbikes.size(); i++) {
			if (motorbikes.get(i).getManu().equals(manu)) {
				list.add(motorbikes.get(i));
			}
		}
		return list;
	}

	public static ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes) {
		double max = motorbikes.get(0).getWeight();
		ArrayList<Motorbike> list1 = new ArrayList<Motorbike>();
		for (int i = 0; i < motorbikes.size(); i++) {
			if (max < motorbikes.get(i).getWeight())
				max = motorbikes.get(i).getWeight();
		}

		for (int i = 0; i < motorbikes.size(); i++) {
			if (motorbikes.get(i).getWeight() == max)
				list1.add(motorbikes.get(i));
		}
		return list1;
	}

	public static ArrayList<Motorbike> minQuantity(ArrayList<Motorbike> motorbikes) {
		int min = motorbikes.get(0).getQuantity();
		ArrayList<Motorbike> list2 = new ArrayList<Motorbike>();
		for (int i = 0; i < motorbikes.size(); i++) {
			if (min > motorbikes.get(i).getQuantity())
				min = motorbikes.get(i).getQuantity();
		}

		for (int i = 0; i < motorbikes.size(); i++) {
			if (motorbikes.get(i).getQuantity() == min)
				list2.add(motorbikes.get(i));
		}
		return list2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Motorbike> motorbikes = new ArrayList<Motorbike>();
		int n = Integer.parseInt(sc.nextLine());
		inputMotorbike(motorbikes, n);
		int c = Integer.parseInt(sc.nextLine());

		switch (c) {
		case 1:
			String manu = "Honda";
			ArrayList<Motorbike> list = search(manu, motorbikes);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).printMotorbike());
			}
			break;
		case 2:
			ArrayList<Motorbike> list2 = maxWeight(motorbikes);
			for (int i = 0; i < list2.size(); i++) {
				System.out.println(list2.get(i).printMotorbike());
			}
			break;
		case 3:
			ArrayList<Motorbike> list3 = minQuantity(motorbikes);
			for (int i = 0; i < list3.size(); i++) {
				System.out.println(list3.get(i).printMotorbike());
			}
			break;
		default:
			break;
		}
	}
}
