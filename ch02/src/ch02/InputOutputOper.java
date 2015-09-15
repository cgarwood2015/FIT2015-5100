package ch02;

/**
 * @author Clayton Omar. Garwood
 * CIS5100 - Florida Institute of Technology
 * Assignment - This program is the fullfilment of requirement for WK2Assignment
 * 				InputOutputOper - This module creates a simple menu interface
 * 				that takes you to the various assignments i.e. 2.15, 2.16, 2.20, 
 * 				2.23 and 2.28.
 * 
 * Menu Option	1 - Arithmetic Operation - The user should be asked to enter two 
 * 					integer values then the application computes the sum, product
 * 					difference and quotient.
 * 
 *    			2 - Number Comparison - Users are required to enter two numbers 
 *  				(only integers) after which the application displays the large 
 *  				of the two numbers.
 *  
 *   			3/4 - Display output using println and printf
 *   			5 - Circle - Determine the properties of a circle i.e. Diameter, Circumference
 *   				and Area based on the user entering the radius.
 *   
 *   			6 - Exit the application
 *    				
 */
public class InputOutputOper {

	public static void main(String[] args) {

		try{
			/*Create a label while loop, ensure the uer stays in the application*/
			cntrl: while(true){
					
				System.out.println("");
				System.out.println("");
				/*Switch controls the user choices*/
				switch(displayMenu()){
				case 1: 
					ArithmeticOper oper = new ArithmeticOper(); //Arithmetic Operations class
					oper.printArithmetics();
					break;
				case 2:
					CompareOper comp = new CompareOper(); //Comparison Operations class
					comp.compareNumber();
					break;
					
				case 3:
					DisplayStars disp = new DisplayStars();  //Display class
					disp.displayPL();
					break;
				case 4:
					DisplayStars dispPF = new DisplayStars(); //Display class
					dispPF.displayPF();
					break;
				case 5:
					Circle cls = new Circle(); //Circle Properties class
					cls.circleProperties();
					break;

				case 6:
					break cntrl;   //Escape the labeled while loop
		
				default:
					System.out.println("Invalid option.");
					break;
				}
				
				clearScreen();  //Clear the Console after user operations

			}	

		}catch(Exception e){  //Handles general exceptions.
			System.out.println("Invalid Entry or operation");
		}
	
	}
	
	/*Method to clear the Console, working is expects to be about 25 X 80*/
	/*The method is private on this class should have access*/
	private static void clearScreen(){
		for(int i = 0;i < 25;i++){
			System.out.println();
		}
	}

	/*Method to build the display menu.*/
	/*The method is private on this class should have access*/
	private static int displayMenu(){
		int selOpt = 0;

		System.out.println("*********************************************************");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*             CIS 5100 - CHAPTER 2 EXCERCISES           *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*********************************************************");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    1.   2.15 - Arithmetic Calculations                *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    2.   2.16 - Number Comparison                      *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    3.   2.20 - Display using println                  *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    4.   2.23 - Display using printf                   *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    5.   2.28 - Circle Properties                      *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    6.   Exit                                          *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*********************************************************");
		System.out.print("Please select a number to run your application:");
		selOpt = ScannerUtility.getArithmeticInput();
		
		return selOpt;  //Return user's choice.
	}

}
