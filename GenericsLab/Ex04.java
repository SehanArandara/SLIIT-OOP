package Tute;

import java.util.ArrayList;

public class Ex04 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(25);
		arr.add(50);
		
		AddINT INT = new AddINT();
		System.out.println("Sum of INTEGER ARRAY LIST :"+INT.add(arr));
		
		ArrayList<Float> arr1 = new ArrayList<Float>();
		arr1.add(15.04f);
		arr1.add(22.58f);
		arr1.add(50.f);
		
		AddFLOAT FLOAT = new AddFLOAT();
		System.out.println("Sum of FLOAT ARRAY LIST :"+FLOAT.add(arr1));
	
	}
	
}

interface Add<T extends Number> {
	T sum();
	T add(ArrayList<T> AL);
}

class AddINT implements Add<Integer>{
	
	public Integer sum() {
		return 0;
	}
	public Integer add(ArrayList<Integer> AL) {
		Integer s = sum();
		
		for(int i=0;i<AL.size();i++) {
			s+=AL.get(i);
		}
		
		return s;
	}
}

class AddFLOAT implements Add<Float>{

	
	public Float sum() {
		return 0.0f;
	}
	public Float add(ArrayList<Float> AL) {
		Float s = sum();
		
		for(int i=0;i<AL.size();i++) {
			s+=AL.get(i);
		}
		
		return s;
	}
}

class AddDOUBLE implements Add<Double>{
	
	
	public Double sum() {
		return 0.0;
	}
	public Double add(ArrayList<Double> AL) {
		Double s = sum();
		
		for(int i=0;i<AL.size();i++) {
			s+=AL.get(i);
		}
		
		return s;
	}
}