package src.student_2;

public class Student {
	
	private String hovaten;
    private double diem;
    
    public Student(String hovaten, double diem) {
		this.hovaten = hovaten;
		this.diem = diem;
	}

	public double getDiem()
    {
        return diem;
    }
    public void printStudent()
    {
        System.out.println(hovaten + " " + diem);
    }
}
