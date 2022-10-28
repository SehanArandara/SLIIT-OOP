package TEST02;

import java.util.Scanner;

public class Employee {
	private String Empid;
	private String name;
	private String address;
	
	public Employee(String empid, String name, String address) {
		Empid = empid;
		this.name = name;
		this.address = address;
	}
	
	public void Read() {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("enter Employee ID :");
		this.Empid= scn.nextLine();
		
		System.out.println("enter Employee Name :");
		this.name = scn.nextLine();
		
		System.out.println("enter Employee address :");
		this.address = scn.nextLine();
		
	}
	public void print() {
		System.out.println("ID :"+this.Empid);
		System.out.println("Name :"+this.name);
		System.out.println("Address "+this.address);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("IT001", "sehan", "Gampaha");
		Manager mng = new Manager("IT101", "Deemantha", "Malabe", "IT", 100, 101, 105);
		
		
	}
}

class Manager extends Employee{
	private String Department;
	private int ProductNo1,ProductNo2,ProductNo3;
	
	public Manager(String empid, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		super(empid, name, address);
		Department = department;
		ProductNo1 = productNo1;
		ProductNo2 = productNo2;
		ProductNo3 = productNo3;
	}
	
	public void Read() {
		super.Read();
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Enter Department :");
			this.Department = scn.nextLine();
			
			System.out.println("enter product 01 :");
			this.ProductNo1 = scn.nextInt();
			
			System.out.println("enter product 02 :");
			this.ProductNo2 =scn.nextInt();
			
			System.out.println("enter product 03 :");
			this.ProductNo3 =scn.nextInt();
		}catch(Exception e) {
			System.out.println("INVALID INPUTS");
		}
	
	}
	
	public void Print() {
		super.print();
		System.out.println("Department :"+this.Department);
		System.out.println("Product 01 :"+this.ProductNo1);
		System.out.println("product 02 :"+this.ProductNo2);
		System.out.println("product 03 :"+this.ProductNo3);
	}
	
	
}
