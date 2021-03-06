package mainAdvance;

import java.util.Scanner;



public class ConverterAdvance {

	public static void main(String[] args) {
		Scanner userChoice = new Scanner(System.in); 
		
		
  // Display for user to choose
		System.out.println("Please select an option: " +
				"\n1. Volume Conversions" +
				"\n2. Distance Conversions" +
				"\n3. Temperature Conversions" +
				"\n4. Quit");

		         //user input choice	
				int firstChoice = userChoice.nextInt();
				
				
				
		//User option to quit
			int lastMenu = 4;
			
		//if user input does not quit, keep displaying menu	
		while (firstChoice != lastMenu) {
			
				//what to display base on user input
				switch (firstChoice) {
				case 1: 
					firstChoice = volumeComverter(userChoice);
					break;
					
				case 2:
					firstChoice = distanceComverter(userChoice);
					break;

				case 3:
					firstChoice = temperatureComverter(userChoice);
					break;

			default:
				System.out.println("The option does not exist");
				
				 // Display option for user
				System.out.println("Please select an option: " +
						"\n1. Volume Conversions" +
						"\n2. Distance Conversions" +
						"\n3. Temperature Conversions" +
						"\n4. Quit");

				//ask for user input again
				 firstChoice = userChoice.nextInt();
				
}
	
			
	}
		//if user input is 4 end Converter
		if(firstChoice == lastMenu) {
			System.out.println("Thank you for playing");
		}
				userChoice.close(); //option scanner closed
				
		
		}

	public static int temperatureComverter(Scanner userChoice) {
		int firstChoice, secondChoice;
		double thirdChoice;
		
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Kelvin to Celsius");
        secondChoice = userChoice.nextInt();
        
        if (secondChoice == 1) {
    		System.out.println("input Celsius? ");
    		//ask for user input again
    		thirdChoice = userChoice.nextInt();
    		 System.out.println("The conversion from celsius to fahrenheit is "+ (thirdChoice * 1.8 + 32 ) + " Fahrenheit");
            }
            if (secondChoice == 2) {
        		System.out.println("input Kelvin? ");
        		thirdChoice = userChoice.nextInt(); 
        		
        		 System.out.println("The conversion from Kelvin to Celsius is "+ (thirdChoice - 273.15) + " Celsius");
                }
//ask for user input again
 firstChoice = userChoice.nextInt();
		return firstChoice;
	}

	public static int distanceComverter(Scanner userChoice) {
		int firstChoice, thirdChoice, secondChoice;
		
		System.out.println("1. Feet to Meters");
		System.out.println("2. Miles to Kilometers");
        secondChoice = userChoice.nextInt();
		
        if (secondChoice == 1) {
    		System.out.println("How many Feet? ");
    		//ask for user input again
    		thirdChoice = userChoice.nextInt();
    		 System.out.println("The conversion from feet to meters is "+thirdChoice /3 + " Meters");
            }
            if (secondChoice == 2) {
        		System.out.println("How many miles? ");
        		thirdChoice = userChoice.nextInt(); 
        		
        		 System.out.println("The conversion from miles to kilometers is "+thirdChoice *1.609 + " kilometers");
                }

//ask for user input again
 firstChoice = userChoice.nextInt();
		return firstChoice;
	}

	public static int volumeComverter(Scanner userChoice) {
		int firstChoice, thirdChoice, secondChoice;
		
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Teaspoons to cups");
        secondChoice = userChoice.nextInt();
		
        if (secondChoice == 1) {
		System.out.println("How many Teaspoons? ");
		//ask for user input again
		thirdChoice = userChoice.nextInt();
		 System.out.println("The conversion from teaspoons to tablespoons is "+thirdChoice /3 + " Teaspoons");
        }
        if (secondChoice == 2) {
    		System.out.println("How many teaspoons? ");
    		//ask for user input again
    		thirdChoice = userChoice.nextInt();
    		 System.out.println("The conversion from cup to teaspoon is "+thirdChoice /48 + " cups");
            }
		 firstChoice = userChoice.nextInt();
		return firstChoice;
	}
	

}// the end
