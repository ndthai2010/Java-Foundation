package src.student_1;

public class Student {

	 
    private String msv, hovaten; 
    private double diem;        
    
   
    public Student(String msv, String hovaten, double diem) {
		this.msv = msv;
		this.hovaten = hovaten;
		this.diem = diem;
	}

	
	public void printInfor()
    {
        System.out.println(msv + " " + hovaten + " " + Math.round(diem * 10.0) / 10.0);
    }
}
