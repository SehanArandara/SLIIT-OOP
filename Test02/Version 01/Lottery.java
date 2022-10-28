package TEST02;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
	private int[] lotteyNumbers = new int[5];
	
	// matched Array
	private HashSet<Integer> MatchArray = new HashSet<>();
	// default constructor
	Lottery() {
		Random r = new Random();
		for(int i=0;i<5;i++) {
			lotteyNumbers[i]=r.nextInt(9);
		}
	}
	// display matched Number
	public void showMatch() {
		System.out.print("\nMatching Number :");
		for(int i:MatchArray) {
			System.out.print(i+"\t");
		}
	}
	// Count No of matching numbers
	public int countMatching() {
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		
		System.out.println("Enter User Numbers");
		for(int i=0;i<5;i++) {
			arr[i]= scn.nextInt();
		}
		
		System.out.print("User's Number   :");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.print("\nLottery Number :");
		for(int i:this.lotteyNumbers) {
			System.out.print(i+"\t");
		}
		
		for(int i:lotteyNumbers) {
			for(int j:arr) {
				if(i==j) {
					this.MatchArray.add(i);
				}
			}
		}
		return MatchArray.size();
	}
	// main Function
	public static void main(String[] args) {
		Lottery L = new Lottery();
		
		System.out.println("\nnumber of matching digits :"+L.countMatching());
		L.showMatch();
	}
}
