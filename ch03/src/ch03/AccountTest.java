package ch03;

import java.util.Scanner;  //Import the Scanner class to accept input

public class AccountTest {

	public static void main(String[] args) {
		
		try{
			Account account1 = new Account("Jane Green",50.00);
			Account account2 = new Account("John Blue",-7.50);
			
			/*Create a label while loop, ensure the uer stays in the application*/
			while(true){
					
				System.out.println("");
				System.out.println("");
				/*Switch controls the user choices*/

				System.out.printf("%s balance: $%.2f %n",account1.getName(), account1.getBalance());
				System.out.printf("%s balance: $%.2f %n%n",account2.getName(), account2.getBalance() );
				System.out.println("");
				System.out.println("");
				
				int subMenu =  subMenu();

				if( subMenu == 1){
					System.out.print("Enter deposit amount for account1: "); // prompt
					double depositAmount = ScannerUtility.getFloatPointInput(); // obtain user input
					
					System.out.print("Enter deposit amount for account2: "); // prompt
					double depositAmount1 = ScannerUtility.getFloatPointInput(); // obtain user input
					
					System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
					account1.deposit(depositAmount);
					
					System.out.printf("%s balance $%.2f%n",account1.getName(),account1.getBalance());
					System.out.printf("%s balance $%.2f%n",account2.getName(),account2.getBalance());
					
					System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount1);
					account2.deposit(depositAmount1);
					
					System.out.printf("%s balance $%.2f%n",account1.getName(),account1.getBalance());
					System.out.printf("%s balance $%.2f%n",account2.getName(),account2.getBalance());
				}else{
				
					if(subMenu == 2){
						System.out.print("Enter withdrawal amount for account1: "); // prompt
						double withdrawalAmount = ScannerUtility.getFloatPointInput(); // obtain user input
						
						System.out.print("Enter withdrawal amount for account2: "); // prompt
						double withdrawalAmount1 = ScannerUtility.getFloatPointInput(); // obtain user input
						
						System.out.printf("%nSubtracting %.2f to account1 balance%n%n",withdrawalAmount);
						account1.withdrawal(withdrawalAmount);
						
						System.out.printf("%s balance $%.2f%n",account1.getName(),account1.getBalance());
						System.out.printf("%nnSubtracting %.2f to account2 balance%n%n",withdrawalAmount1);
						account2.withdrawal(withdrawalAmount1);
						
						System.out.printf("%s balance $%.2f%n",account2.getName(),account2.getBalance());
					}
				}

				
				clearScreen();  //Clear the Console after user operations

			}	

		}catch(Exception e){  //Handles general exceptions.
			System.out.println("Invalid Entry or operation");
			e.printStackTrace();
		}
		

	}
	
	/*Method to clear the Console, working is expects to be about 25 X 80*/
	/*The method is private on this class should have access*/
	public static void clearScreen(){
		for(int i = 0;i < 25;i++){
			System.out.println();
		}
	}

	public static int subMenu(){
		int selsOpt = 0;

		System.out.println("*********************************************************");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*             TRANSACTION TYPE - DEPOSIT OR WITHDRAWAL  *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*********************************************************");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    1.   Deposit                                       *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*    2.   Withdrawal                                    *");
		System.out.println("*\t\t\t\t\t\t\t*");
		System.out.println("*********************************************************");
		System.out.print("Please select transaction type:");
		selsOpt = ScannerUtility.getArithmeticInput();
		
		return selsOpt;  //Return the transaction type
		
	}

} //End Class
