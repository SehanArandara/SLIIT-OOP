



import java.util.*;


public class Main {
	public static void main(String[] args) {
		// scanner object to get input 
		Scanner scn= new Scanner(System.in);

		int type=1;
		double TotalFee=0;
		String option;

		// array to get selections in room
		boolean selection[] = new boolean[5];

		//creating an object for calculation 
		RoomChargeCalculator r1 = new RoomChargeCalculator();

		while(type!=4) {
			System.out.println("Room Charge Calculator");
			System.out.println("1.Delux-Double \n2.Standard-Family\n3.Standard-Single");
			System.out.println("4.Quit");
			System.out.print("Enter your choice (1-4) :");
			type= Integer.parseInt(scn.nextLine());




			if(type==1) {
				System.out.println("\n\nAdd more service\n\n");
				System.out.println("1. Balcony - Rs.500/-");
				System.out.println("2. Parking - Rs.200/-");
				System.out.println("3. TV - Rs.200/-");
				System.out.println("4. Kitchen - Rs.1000/-");
				System.out.println("5. WiFi - Rs.100/-");
				System.out.println("\n\nIf you want to add more services enter yes or no ");

				System.out.print(" Balcony - :");
				option = scn.nextLine();			
				selection[0]= (option.equals("yes")) ? true : false;     // convert string into boolean using if short hand method


				System.out.print("\n Parking - :");
				option = scn.nextLine();			
				selection[1]= (option.equals("yes")) ? true : false;

				System.out.print("\n TV - :");
				option = scn.nextLine();			
				selection[2]= (option.equals("yes")) ? true : false;

				System.out.print("\n Kitchen - :");
				option = scn.nextLine();			
				selection[3]= (option.equals("yes")) ? true : false;
				
				System.out.print("\n wifi - :");
				option = scn.nextLine();			
				selection[4]= (option.equals("yes")) ? true : false;

				// call the method
				TotalFee+=r1.getChargeDeluxDouble(selection[0], selection[1], selection[2], selection[3], selection[4]);
			}

			if(type==2) {
				System.out.println("\n\nAdd more service\n\n");
				System.out.println("1. Parking - Rs.200/-");
				System.out.println("2. Kitchen - Rs.500/-");
				System.out.println("3. Garden - Rs.200/-");
				System.out.println("If you want to add more services please enter 'true' if you don't want that faciliy enter 'false'");

				System.out.print("\n Parking - :");
				scn.next();
				option = scn.nextLine();			
				selection[0]= (option.equals("yes")) ? true : false;

				System.out.print("\n Kitchen - :");
				option = scn.nextLine();			
				selection[1]= (option.equals("yes")) ? true : false;

				System.out.print("\n Garden - :");
				option = scn.nextLine();			
				selection[2]= (option.equals("yes")) ? true : false;

				// call the method
				TotalFee+= r1.getChargeStandardFamily(selection[0], selection[1], selection[2]);
			}
			if(type==3) {
				System.out.println("\n\nAdd more service\n\n");
				System.out.println("1. Parking - Rs.200/-");
				System.out.println("2. AC - Rs.500/-");
				System.out.println("3. WiFi - Rs.100/-");
				System.out.println("If you want to add more services please enter true if you don't want that faciliy enter false");

				System.out.print("\n Parking - :");
				scn.next();
				option = scn.nextLine();			
				selection[0]= (option.equals("yes")) ? true : false;

				System.out.print("\n AC - :");
				option = scn.nextLine();			
				selection[1]= (option.equals("yes")) ? true : false;

				System.out.print("\n wifi - :");
				option = scn.nextLine();			
				selection[2]= (option.equals("yes")) ? true : false;

				// call the method
				TotalFee+= r1.getChargeStandardSingle(selection[0], selection[1], selection[2]);
			}
			if(type==4) {
				System.out.println("\n\n\nYour Total Bill =Rs."+TotalFee);
				System.out.println("Thank you!");
				break;
			}
			if(type<1 || type >4) {
				System.out.println("***INVALID INPUT TRY AGAIN***\n");

			}

		}

	}
}