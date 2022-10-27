package Tute;


import java.util.Scanner;


public class ex03{


	// method that return a array
	public static Integer[] takeinput() {
		
		Scanner scn =  new Scanner(System.in);
		System.out.println("enter array size :");
		int i = scn.nextInt();
		
		Integer[] arr = new Integer[i];
		
		for(int j=0;j<i;j++) {
			System.out.println("enter number :");
			arr[j]=scn.nextInt();
		}
		
		return arr;
	}
	
	// method that return max and this is a generic method
	static <T extends Comparable<T>> T findMax(T a[]){
		T max=a[0];
		for(int k=0;k<a.length;k++) {
			if(a[k].compareTo(max)>0) {
				max=a[k];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Maximum Number :"+findMax(takeinput()));
		
	}
	
	
}
