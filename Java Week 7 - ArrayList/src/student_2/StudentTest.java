package src.student_2;

import java.util.Scanner;

public class StudentTest {
	
	public static void inputStudents (Student [] studentArray, Scanner reader)
    {
        for(int i = 0; i < studentArray.length; i++) {
        	String hovaten = reader.nextLine();
        	double diem = Double.parseDouble(reader.nextLine());
        	
        	studentArray[i] = new Student(hovaten, diem);
        }
    }
	
    public static void printStudents (Student[] studentArray)
    {
    	for(int i = 0; i < studentArray.length; i++) {
    		studentArray[i].printStudent();
    	}
    }
    
    public static void sortScores (Student[] studentArray)
    {
        for(int i = 0; i < studentArray.length; i++) {
        	for(int j = i + 1; j < studentArray.length; j++) {
        		if(studentArray[i].getDiem() < studentArray[j].getDiem()) {
        			Student temp = studentArray[i];
        			studentArray[i] = studentArray[j];
        			studentArray[j] = temp;
        		}
        	}
        }
        
        for(int i = 0; i < studentArray.length; i++) {
    		studentArray[i].printStudent();
    	}
    }
    
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        	System.out.print("n = ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];
        inputStudents(students, sc);
        printStudents(students);
        sortScores(students);
    }
}
