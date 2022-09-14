

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		// exercise 1
		System.out.println("Hello world!");
		System.out.println("It's been nice knowing you.\nGoodbye world!");

		System.out.println("\n\n");

		//exercise 2
		System.out.println("==================================");
		System.out.println("=\tStudent information\t=");
		System.out.println("==================================");
		System.out.println("=Name          :Sehan Deemantha  =");
		System.out.println("=Reg no        :reg 100         =");
		System.out.println("=Adress        :Malabe           =");
		System.out.println("==================================");


		System.out.println("\n\n");

		//exercise 3
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the age :");
		age=obj.nextInt();
		if(age>18){
			System.out.println("adult");
		}
		else{
			System.out.println("Child");
		}



		System.out.println("\n\n");

		//exercise 4
		int day;
		String D;
		Scanner obj1= new Scanner(System.in);
		System.out.println("value of the day :");
		day=obj1.nextInt();
		switch(day){
			case 1 : D="Mon"; break;
			case 2 : D="Tue"; break;
			case 3 : D="wed"; break;
			case 4 : D="Thu"; break;
			case 5 : D="fri"; break;
			case 6 : D="sat"; break;
			case 7 : D="sun"; break;
			default : D="invalid day";
		}
		System.out.println("Day of the week :"+D);
		System.out.println("Good bye!");
		
		int i=1;
		int j=1;
		while(i<6) {
			while(j<6) {
				System.out.print("*");
				j++;
			}
			j=1;
			System.out.println("");
			i++;
		}
		
		
		
	}





		

}

