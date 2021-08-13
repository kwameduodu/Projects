package mainAdvance;

import java.util.Scanner;



public class ConverterAdvance {

	public static void main(String[] args) {
		
		
  // Display for user to choose
		System.out.println("Please select an option: " +
				"\n1. Cups to Teaspoons" +
				"\n2. Miles to Kilometers" +
				"\n3. US Gallons to Imperial Gallons" +
				"\n4. Quit");
		
		//user input choice
				Scanner user_menu = new Scanner(System.in);
				int user_option = user_menu.nextInt();
				
				//user conversation
				Scanner option = new Scanner(System.in);
				int option1;
				
		//User option to quit
			int lastMenu = 4;
			
		//if user input does not quit, keep displaying menu	
		while (user_option != lastMenu) {
			
				//what to display base on user input
				switch (user_option) {
				case 1: 
					System.out.println("How many cups? ");
					//ask for user input again
					option1 = option.nextInt(); 
					 System.out.println("The conversion from cup to teaspoon is "+option1 *48 + " Teaspoons");
					 user_option = user_menu.nextInt();
					break;
					
				case 2:
					System.out.println("How many miles? ");
					option1 = option.nextInt(); 
					 System.out.println("The conversion from miles to kilometers is "+option1 *1.609 + " kilometers");
				//ask for user input again
				 user_option = user_menu.nextInt();
					break;

				case 3:
					System.out.println("How many Gallons? ");
					option1 = option.nextInt(); 
					 System.out.println("The conversion from US Gallons to Imperial is "+option1 /1.201 + " Imperial Gallons");
				//ask for user input again
				 user_option = user_menu.nextInt();
					break;

			default:
				System.out.println("The option does not exist");
				
				 // Display option for user
				System.out.println("Please select an option: " +
						"\n1. Cups to Teaspoons" +
						"\n2. Miles to Kilometers" +
						"\n3. US Gallons to Imperial Gallons" +
						"\n4. Quit");
				//ask for user input again
				 user_option = user_menu.nextInt();
				
}
	
			
	}
		//if user input is 4 end Converter
		if(user_option == lastMenu) {
			System.out.println("Thank you for playing");
		}
				user_menu.close(); //option scanner closed
				option.close(); // conversion scanner closed
		
		}
	

}// the end
