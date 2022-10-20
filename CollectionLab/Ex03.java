import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		HashSet<Double> height =  new HashSet<>();
		
		Scanner scn = new Scanner(System.in);
		
		double h;
		for(int i=0;i<10;i++) {
			System.out.println("enter your height :");
			height.add(scn.nextDouble());
		}
		
		for(Object obj :height) {
			System.out.println(obj);
		}
		
		
		
		
	}
	
	
}
