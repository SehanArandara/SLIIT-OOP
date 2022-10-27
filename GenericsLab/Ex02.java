package Tute;

import java.lang.reflect.Array;
import java.util.*;

public class Ex02  <T extends Number> {
	static <T> void swap(ArrayList<T> x,ArrayList<T> y,ArrayList<T> z) {
		
		
		for(int i=0;i<4;i++) {
			z.add(i,x.get(i));
		}
		
		for(int i=0;i<4;i++) {
			x.add(i,y.get(i));
		}
		for(int i=0;i<4;i++) {
			y.add(i,z.get(i));
		}
		x.remove(7);
		x.remove(6);
		x.remove(5);
		x.remove(4);
		y.remove(7);
		y.remove(6);
		y.remove(5);
		y.remove(4);
		
		
		
		System.out.println("Array 01 after swapping :"+x);
		System.out.println("Array 02 after swapping :"+y);
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(50);
		arr2.add(60);
		arr2.add(70);
		arr2.add(80);
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		
		System.out.println("Array 01 before swapping :"+arr1);
		System.out.println("Array 02 before swapping :"+arr2);
		
		System.out.println("------------------------------");
		
		swap(arr1,arr2,arr3);
		
		
	}
	
	
	
	
	
	
	
}


