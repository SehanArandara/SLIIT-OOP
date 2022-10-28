package TEST02;

import java.util.Scanner;

public class AlarmClock {
	private int Hour;
	private int Minute;
	private int Second;
	
	public AlarmClock() {
		this.Hour=12;
		this.Minute=0;
		this.Second=0;
	}
	
	public void InputAlarm() throws InvalidHours,InvalidMinOrSec {
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter Hours :");
			this.Hour=scn.nextInt();
			
			System.out.println("Enter Minutes :");
			this.Minute=scn.nextInt();
			
			System.out.println("Enter Seconds :");
			this.Second =scn.nextInt();
			
		}catch(Exception e) {
			System.out.println("INVALID DATA IS ENTERED");
		}
		if(this.Hour<0 || this.Hour>12) {
			this.Hour=12;
			throw new InvalidHours("ENTERED HOUR IS FROMM OUT OF RANGE");
		}
		if(this.Minute<0 || this.Minute>60 || this.Second<0 || this.Second>60) {
			this.Minute=0;
			this.Second=0;
			throw new InvalidMinOrSec("ENTERED HOUR IS FROMM OUT OF RANGE");
		}
		
	}
	
	public void ShowAlarm() {
		System.out.println("Alarm :"+this.Hour+":"+this.Minute+":"+this.Second);
	}
	
	public void SetAlarm() {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Hours :");
		this.Hour=scn.nextInt();
		
		System.out.println("Enter Minutes :");
		this.Minute=scn.nextInt();
		
		System.out.println("Enter Seconds :");
		this.Second =scn.nextInt();
		
		if(this.Hour<0 || this.Hour>12) {
			this.Hour=0;
		}
		if(this.Minute<0 || this.Minute>60 || this.Second<0 || this.Second>60) {
			this.Minute=0;
			this.Second=0;
		}
		
		
		
	}
	
}



class InvalidHours extends Exception{
	public InvalidHours(String msg) {
		super(msg);
	}
}

class InvalidMinOrSec extends Exception{
	public InvalidMinOrSec(String msg) {
		super(msg);
	}
}
