package TEST02;

import java.util.Random;

public class RandNum {
	private int[][] arr = new int[5][5];
	//constructor
	RandNum() {
		Random r = new Random();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				this.arr[i][j] = (r.nextInt(100))+1;
			}
		}
	}
	
	
	// method to calculate maximum
	public int calMax() {
		int max=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(this.arr[i][j]>max) {
					max=this.arr[i][j];
				}
			}
		}
		
		return max;
	}
	
	
	// method to calculate minimum
	public int calMin() {
		int min=105;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(this.arr[i][j]<min) {
					min=this.arr[i][j];
				}
			}
		}
			
			return min;
	}
	
	//method to calculate average 
	public double calAVG() {
		int sum=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				sum+=this.arr[i][j];
			}
		}
		
		return (double)sum/25.0;
	}
	
	//method to display
	public void display() {
		
		System.out.println("The array :");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(this.arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("Maximum value of the array :"+this.calMax());
		System.out.println("Minimum value of the array :"+this.calMin());
		System.out.println("Average value of the array :"+this.calAVG());
		
	}
	
	// main function
	
	public static void main(String[] args) {
		RandNum r =new RandNum();
		r.display();
	}
	
	
}
