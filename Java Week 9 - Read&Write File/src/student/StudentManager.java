package src.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentManager {
	private int n;
	private Student[] students;

	public void readStudentsFromFile(String fileName)
	{
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
			n = Integer.parseInt(sc.nextLine());
			students = new Student[n];
			for(int i = 0; i < n; i++) {
				String id = sc.nextLine();
				String name = sc.nextLine();
				double score = Double.parseDouble(sc.nextLine());
				
				students[i] = new Student(id, name, score);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sortdBySCore()
	{
		for(int i = 0; i < students.length; i++) {
			for(int j = i + 1; j < students.length; j++) {
				if(students[i].getScore() < students[j].getScore()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
	}
	
	
	public void printStudentsToFile(String fileName)
	{
		Formatter fmt = null;
		try {
			fmt = new Formatter(new File(fileName));
			System.out.println(n);
			for(Student stu : students) {
				System.out.println(stu.getId() + "\n" + stu.getName() + "\n" + stu.getScore());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fmt.close();
		}
	}
	

	public void readFile(String fileName)
	{
		try {
			Scanner reader = new Scanner(new File(fileName));
			while(reader.hasNext())
				System.out.println(reader.nextLine());
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.readStudentsFromFile("students.txt");
		sm.sortdBySCore();
		sm.printStudentsToFile("studentsSorted.txt");
		sm.readFile(System.getProperty("user.dir")+"/"+"studentsSorted.txt");
	}
}
