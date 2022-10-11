import java.util.Scanner;

public class Student implements IDisplay,IInput {
	int studentID;
	String name;
	
	public void input() {
		System.out.println("enter details :");
		Scanner s1 = new Scanner(System.in);
		this.studentID = s1.nextInt();
		s1.nextLine();
		this.name = s1.nextLine();
		
	}
	public void print() {
		System.out.println("this is"+this.name);
	}
	 public void printDetails() {
		System.out.println("Name "+ this.name);
		System.out.println("student ID "+this.studentID);
	 }
	 public static void main(String[] args) {
		 Student s1 = new Student();
		/* s1.input();
		 s1.print();
		 s1.printDetails();*/
		 
		 IDisplay ID = new Student();
		 IInput IN = new Student();
		 s1.input();
		 s1.print();
		 s1.printDetails();
	 }
	
}
