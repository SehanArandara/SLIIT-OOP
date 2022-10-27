package Tute;

import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private Double bsalary;
	private Double netsalary;
	private Double totalsalary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBsalary() {
		return bsalary;
	}
	public void setBsalary(Double bsalary) {
		this.bsalary = bsalary;
	}
	public Double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(Double netsalary) {
		this.netsalary = netsalary;
	}
	public Double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(Double totalsalary) {
		this.totalsalary =totalsalary;
	}
	
	public void cal() {
		this.totalsalary = this.bsalary+this.netsalary;
	}
	
public static void main(String[] args) {
		
		String id;
		String name;
		String bsalary;
		String netsalary;
		
		
		Scanner scn = new Scanner(System.in);
		
		Employee e = new Employee();
		
		
		System.out.println("Enter your ID :");
		id=scn.nextLine();
		e.setId(id);
		
		System.out.println("enter your Name :");
		name = scn.nextLine();
		e.setName(name);
		
		System.out.println("Enter your basic Sal");
		bsalary = scn.nextLine();
		e.setBsalary(Double.parseDouble(bsalary));
		
		System.out.println("Enter Your net sal :");
		netsalary = scn.nextLine();
		e.setNetsalary(Double.parseDouble(netsalary));
		
		
		e.cal();
		
		
		
		System.out.println("\n------------------------\n");
		System.out.println("YOUR ID :"+e.getId());
		System.out.println("YOUR NAME :"+e.getName());
		System.out.println("YOUR TOTAL SALARY :"+e.getTotalsalary());
		
		
		
	}

	
	
	
}


