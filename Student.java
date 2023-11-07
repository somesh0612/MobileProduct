package xyz;

public class Student {
	private String name;
	private int rollNo;
	StudentMarks sm;
	
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		this.sm=sm;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void display() {
		System.out.println("Name : "+name+" ,RollNo : "+rollNo);
	}

}
class StudentMarks extends Student{
	private int maths;
	private int physics;
	private int science ;

	public StudentMarks(String name, int rollNo, int maths,int physics, int science) {
		super(name, rollNo);
		this.maths=maths;
		this.physics=physics;
		this.science=science;
	}
	public int getScienceMarks() {
		return science;
	}
	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", physics=" + physics + ", science=" + science + "]";
	}
}


