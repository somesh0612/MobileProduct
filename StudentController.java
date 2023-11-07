package xyz;
import java.util.*;
public class StudentController {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter No. of Students :");
		int n=scn.nextInt();
		scn.nextLine(); // Consume the newline character
		
		StudentMarks[] student=new StudentMarks[n];
		for(int i=0;i<student.length;i++) {
			System.out.println("Enter details of Student "+(i+1)+" :");
			
			System.out.println("Name");
			String name=scn.nextLine(); 
			scn.nextLine(); // Consume the newline character
			
			System.out.println("RollNo");
			int roll=scn.nextInt(); 
			scn.nextLine(); // Consume the newline character
			
			System.out.println("Maths Marks");
			int maths=scn.nextInt();
			scn.nextLine(); // Consume the newline character
			System.out.println("Physics Marks");
			int physics=scn.nextInt();
			scn.nextLine(); // Consume the newline character
			System.out.println("Science Marks");
			int science=scn.nextInt();
			scn.nextLine(); // Consume the newline character
			
			student[i]=new StudentMarks(name,roll,maths,physics,science);
		}
		
		StudentMarks highestScience=student[0];
		for(int i=0;i<student.length;i++) {
			if(student[i].getScienceMarks()>highestScience.getScienceMarks()) {
				highestScience=student[i];
			}
		}
		System.out.println("\nStudent with the highest Science marks:");
       highestScience.display();
       System.out.println(highestScience);
	}

}
