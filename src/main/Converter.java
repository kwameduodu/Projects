package main;

import java.util.Scanner;



public class Converter {

	public static void main(String[] args) {
		
		
  // Display for user to choose
		System.out.println("Please select an option: " +
				"\n1. Cups to Teaspoons" +
				"\n2. Miles to Kilometers" +
				"\n3. US Gallons to Imperial Gallons" +
				"\n4. Quit");
		
		//user make a choice
				Scanner user_menu = new Scanner(System.in);
				int user_option = user_menu.nextInt();
				
		//User option to quit
			int lastMenu = 4;
			
		//if user input does not quit, keep displaying menu	
		while (user_option != lastMenu) {
			
				//what to display base on user input
				switch (user_option) {
				case 1: //ask for user input again
					 user_option = user_menu.nextInt(); 
					 System.out.println("The conversation of cup to teaspoon is "+user_option *48 + " Teaspoons");
				
					break;
					
				case 2:System.out.println( user_option*1.6 + " Kilometers");
				//ask for user input again
				 user_option = user_menu.nextInt();
					break;

				case 3:System.out.println( user_option/1.201 + " gallons");
				//ask for user input again
				 user_option = user_menu.nextInt();
					break;

			default:
				System.out.println("The option does not exist");
				//ask for user input again
				 user_option = user_menu.nextInt();
				 
				System.out.println("Please select an option: " +
						"\n1. Cups to Teaspoons" +
						"\n2. Miles to Kilometers" +
						"\n3. US Gallons to Imperial Gallons" +
						"\n4. Quit");
				
				
}
	
			
	}
		//if user input is 4 end Converter
		if(user_option == lastMenu) {
			System.out.println("Thank you for playing");
		}
				user_menu.close(); //scanner closed
		
		}
	

}// the end
