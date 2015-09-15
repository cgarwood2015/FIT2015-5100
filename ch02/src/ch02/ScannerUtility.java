package ch02;

/**
 * Class			ScannerUtility - Utility function
 * Methods:  		getArithmeticInput - Get the user arthmetic input.
 * 					pressAnyKey - Accepts any user inputs and continue processing  
 * 								
 * Exceptions:		Exceptions throws general exception for the calling function to handle  
 * 
 */


import java.util.Scanner;  //Import the Scanner Library to handle user's input

public class ScannerUtility {

	public static Scanner inptScan = new Scanner(System.in);  //Static variable.
	public ScannerUtility(){
	}
	
	/*Static function does not require to be called on the instance object*/
	public static int getArithmeticInput(){
		return inptScan.nextInt();
	}
	
	/*Static function does not require to be called on the instance object*/
	public static void pressAnyKey()throws Exception{
		Thread.sleep(1500);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Press Any Key to continue");
		System.in.read();
	}
	
}
