

import java.util.*;

public class Main {
	private double m1,m2,m3;
	private double avg;
	private int id;
	private String name;
	// default constructor
	Main(){
		 this.m1=0;
		 this.m2=0;
		 this.m3=0;
	}
	// calculate the average
	public double CalAvg() {
		return (this.m1+this.m2+this.m3)/30;
	}
	// setter to add value
	public void setAvg() {
		this.avg=CalAvg();
	}
	
	// display method
	public void display() {
		System.out.println("Name :-"+this.name);
		System.out.println("ID :-"+this.id);
		System.out.println("average :"+this.avg);
	}
	
	public static void main(String[] args) {
		//scanner
		Scanner s1= new Scanner(System.in);
		
		Main m1 = new Main();
		
		System.out.println("enter the ID");
		m1.id=s1.nextInt();
		
		System.out.println("enter the name");
		s1.nextLine();
		m1.name= s1.nextLine();
		
		System.out.println("enter the 3 marks");
		m1.m1=s1.nextDouble();
		m1.m2=s1.nextDouble();
		m1.m3=s1.nextDouble();
		
		// call cla avg
		m1.CalAvg();
		
		// set avg
		m1.setAvg();
		
		// display
		m1.display();
	}
	
	
}
