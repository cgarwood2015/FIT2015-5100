package ch02;
/**
 * Class			DisplayStars
 * Methods:  		displayPL - Display stars using the priftln function.  The sleep function is 
 * 								used for easy display purpose
 * 					displayPF  - Display star using the printf function.
 * Exceptions:		Exceptions throws general exception for the calling function to handle  
 * 
 */

public class DisplayStars {
	
	public void displayPL() throws Exception{
		System.out.println("*");   //Displays the star and position the cursor at the next line
		Thread.sleep(1000);
		System.out.println("***");  //Displays the star and position the cursor at the next line
		Thread.sleep(1000);
		System.out.println("*****");  //Displays the star and position the cursor at the next line
		Thread.sleep(1000);
		System.out.println("****");  //Displays the star and position the cursor at the next line
		Thread.sleep(1000);
		System.out.println("**");  //Displays the star and position the cursor at the next line
		
		ScannerUtility.pressAnyKey();
	}
	
	public void displayPF()throws Exception{
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");  //Display the string and use the %n
																 //to position the cursor in the next line
																 //Breaking up the text in separate lines. 	

		ScannerUtility.pressAnyKey();  //Waits for user inputs after the user display.
	
	}
}
