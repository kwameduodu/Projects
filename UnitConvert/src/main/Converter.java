package main;

import java.util.Scanner;



public class Converter {

	public static void main(String[] args) {
		
		Scanner userChoice = new Scanner(System.in); //scanner variable
		
  // Display for user to choose
		System.out.println("Please select an option: " +
				"\n1. Cups to Teaspoons" +
				"\n2. Miles to Kilometers" +
				"\n3. US Gallons to Imperial Gallons" +
				"\n4. Quit");
	        	//user input choice
				int userOption = userChoice.nextInt();
				
				//final choice variable
				int userFinalChoice;
				
		//User option to quit
			int lastMenu = 4;
			
		//if user input does not quit, keep displaying menu	
		while (userOption != lastMenu) {
			
				//what to display base on user input
				switch (userOption) {
				case 1: 
					System.out.println("How many cups? ");
					//ask for user input again
					userFinalChoice = userChoice.nextInt(); 
					 System.out.println("The conversion from cup to teaspoon is "+userFinalChoice *48 + " Teaspoons");
					 userOption = userChoice.nextInt();
					break;
					
				case 2:
					System.out.println("How many miles? ");
					userFinalChoice =  userChoice.nextInt(); 
					 System.out.println("The conversion from miles to kilometers is "+userFinalChoice *1.609 + " kilometers");
				//ask for user input again
				 userOption = userChoice.nextInt();
					break;

				case 3:
					System.out.println("How many Gallons? ");
					userFinalChoice =  userChoice.nextInt(); 
					 System.out.println("The conversion from US Gallons to Imperial is "+userFinalChoice /1.201 + " Imperial Gallons");
				//ask for user input again
				 userOption = userChoice.nextInt();
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
				 userOption = userChoice.nextInt();
				
}
	
			
	}
		//if user input is 4 end Converter
		if(userOption == lastMenu) {
			System.out.println("Thank you for playing");
		}
				userChoice.close(); //option scanner closed
				
		
		}
	

}// the end
