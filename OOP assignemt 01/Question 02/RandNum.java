import java.util.*;

public class RandNum {
	// declaration
	private int arr[][]= new int[5][5];
	// attributes
	private int max=1;
	private int min=1000;
	private int sum=0;
	
	private double avg=0;
	
	// constructor
	public RandNum() {
		// create instances of random class
		Random r1= new Random();
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				// assign random value range in 0(inclusive) and  100(exclusive)
				this.arr[i][j]= r1.nextInt(100);
				// add one to make 1(inclusive ) 
				this.arr[i][j]+=1;
			}
		}
	}
	
	// method for calculation check min ,max, and avg
	public void Calculate() {
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				if(this.arr[i][j]>max) {
					this.max=this.arr[i][j];
				}
				if(this.arr[i][j]<min) {
					this.min=this.arr[i][j];
				}
				this.sum+= this.arr[i][j];
			}
		}
		this.avg=(double)this.sum/25;
	}
	
	// method for displaying values , maximum number ,minimum number and average
	public void display() {
		// displaying values 
		System.out.println("Randomly generated array is :-");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(this.arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
		//display max,min,avg
		System.out.println("Maximum number :-"+this.max);
		System.out.println("Minimum number :-"+this.min);
		System.out.println("Average :-"+this.avg);
	}
}