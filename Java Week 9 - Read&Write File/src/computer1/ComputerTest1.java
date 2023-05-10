package src.computer1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import src.computer.Computer;
import src.computer.ComputerTest;

public class ComputerTest1 {

	public static void inputObject(String fileName, ArrayList<Computer> coms) {
		ObjectInputStream buff = null;
		try {
			buff = new ObjectInputStream(new FileInputStream(fileName));
			while(true)
			{
				try {
					Computer computer = (Computer) buff.readObject();
					coms.add(computer);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch(EOFException endofFile) {
			return;
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				buff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 	public static void outputObject(String fileName, ArrayList<Computer> coms) {
 		ObjectOutputStream buff = null;
 		try {
			buff = new ObjectOutputStream(new FileOutputStream(fileName));
			for(Computer c: coms)
				buff.writeObject(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				buff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 	}
	
	public static void output(ArrayList<Computer> computers)
	{
		for(int i = 0; i < computers.size(); i ++)
			System.out.println(computers.get(i).toString());
	}
	
	public static double getAvgPrice(ArrayList<Computer> coms)
	{
		double price = 0, avg = 0.0;
		for(int i = 0; i < coms.size(); i++) {
			price += coms.get(i).getPrice();
			avg = price / coms.size();
		}
		return avg;
	}
	
	public static ArrayList<Computer> getMaxPrice(ArrayList<Computer> coms)
	{
		ArrayList<Computer> list = new ArrayList<Computer>();
		double max = coms.get(0).getPrice();
		for(int i = 0; i < coms.size(); i++) {
			if(max < coms.get(i).getPrice()) {
				max = coms.get(i).getPrice();
			}
		}
		for(int i = 0; i < coms.size(); i++) {
			if(max == coms.get(i).getPrice()) {
				list.add(coms.get(i));
			}
		}
		return list;
	}
	
	public static ArrayList<Computer> getDell(ArrayList<Computer> coms)
	{
		ArrayList<Computer> list = new ArrayList<Computer>();
		for(int i = 0; i < coms.size(); i++) {
			if(coms.get(i).getManu().equals("Dell")) {
				list.add(coms.get(i));
			}
		}
		return list;
	}
	
	public static void sort(ArrayList<Computer> coms)
	{
		for(int i = 0; i < coms.size(); i++) {
			for(int j = i + 1; j < coms.size(); j++) {
				if(coms.get(i).getName().compareTo(coms.get(j).getName()) > 0) {
					Computer temp = coms.get(i);
					coms.set(i, coms.get(j));
					coms.set(j, temp);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ComputerTest1 test = new ComputerTest1();
		ArrayList<Computer> newC = new ArrayList<>();
		test.inputObject("computer.dat", newC);
		ArrayList<Computer> dell = test.getDell(newC);
		test.outputObject("dell.dat", dell);
	}

}

