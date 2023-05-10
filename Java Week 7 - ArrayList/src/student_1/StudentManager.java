package src.student_1;
import java.util.Scanner;

public class StudentManager {

	private Student[] studentArray;
    private int n;
   
    public static Scanner sc = new Scanner(System.in);
    
    	
    public void inputStudents()
    {
    		System.out.print("n = ");
    	this.n = Integer.parseInt(sc.nextLine());
        studentArray = new Student[n];
        
        for(int i = 0; i < n; i++) {
        		System.out.print("ID: ");
        	String msv = sc.nextLine();
        		System.out.print("Name: ");
        	String hoten = sc.nextLine();
        		System.out.print("GPA:");
        	double diem = Double.parseDouble(sc.nextLine());
        	
        	studentArray[i] = new Student(msv, hoten, diem);
        }
    }
    
    public void printStudents()
    {
        for(int i = 0; i < studentArray.length; i++) {
        	studentArray[i].printInfor();
        }
    }
    
    public static void main(String[] args)
    {
       
        StudentManager studentmanager = new StudentManager();
        studentmanager.inputStudents();
        studentmanager.printStudents();
        
    }
}
