package ch02;

/**
 * Class			CompareOper
 * Methods:  		compareNumber - Takes two interger and compare for the larger of the two
 * Exceptions:		Exceptions throws general exception for the calling function to handle  
 * 
 */

public class CompareOper {	

public void compareNumber()throws Exception{
		int oneArith = 0;  //Declare variable to 1 hold integer
		int twoArith = 0;  //Declare variable to 2 hold integer

		System.out.print("Enter first integer:");
		oneArith = ScannerUtility.getArithmeticInput(); //accept user input
		
		System.out.print("Enter second integer:");
		twoArith = ScannerUtility.getArithmeticInput(); //accept 2nd user input

		/*Compare Numbers*/
		if(oneArith == twoArith)
			System.out.println("These numbers are equal.");
		
		if(oneArith < twoArith)
			System.out.printf("%d is larger.",twoArith);
		
		if(oneArith > twoArith)
			System.out.printf("%d is larger.",oneArith);
		
		//After display, wait for the user's input before continue.
		ScannerUtility.pressAnyKey();
	}
}
