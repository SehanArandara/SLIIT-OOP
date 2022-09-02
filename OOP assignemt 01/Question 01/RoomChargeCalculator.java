
public class RoomChargeCalculator {
	// method for calculating the price of delux double room 
		public double getChargeDeluxDouble(boolean balcony,boolean parking,boolean tv,boolean kitchen,boolean wifi) {
			double fixedFee =5000;
			// conditions to check what customer will choose
			if(balcony==true) {
				fixedFee+=500;
			}
			if(parking==true) {
				fixedFee+=200;
			}
			if(tv==true) {
				fixedFee+=200;
			}
			if(kitchen==true) {
				fixedFee+=1000;
			}
			if(wifi==true) {
				fixedFee+=100;
			}
			
			return fixedFee;
			
		}
		
		
		// method for calculating the price of standard family room
		public double getChargeStandardFamily(boolean parking,boolean kitchen,boolean garden) {
			double fixedFee=3000;
			
			if(parking==true) {
				fixedFee+=200;
			}
			if(kitchen==true) {
				fixedFee+=500;
			}
			if(garden==true) {
				fixedFee+=200;
			}
			
			return fixedFee;
		}
		
		
		// method for calculating the price of Standard Single room
		public double getChargeStandardSingle(boolean parking,boolean ac,boolean wifi) {
			double fixedFee=2000;
			
			if(parking==true) {
				fixedFee+=200;
			}
			if(ac==true) {
				fixedFee+=500;
			}
			if(wifi==true) {
				fixedFee+=100;
			}
			
			return fixedFee;
		}
}
