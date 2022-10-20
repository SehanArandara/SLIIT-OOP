import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		
		AddList(AddElements());
		
		
	}
	
	public static ArrayList<Integer> AddElements(){
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("enter number :");
			no=sc.nextInt();
			AL.add(no);
		}
		
		
		
		
		return AL;
	}
	public static void AddList(ArrayList<Integer> al) {
		
		
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum+= al.get(i);
		}
		System.out.println("Sum = "+ sum);
		
		
		
	}
}
