package ch04;

import java.lang.Math;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		int accountNumber = 0;  //Account Number
		int beginBalance = 0;  //Opening Balance
		int totalChanges = 0; //Charges
		int monthlyCredit = 0; //Monthly Credit
		int creditLimit = 0; //Credit Limit Allowed
		int endBalance = 0;  //Closing Balance
		
		try{
			System.out.print("Enter Account Number or -1 to exit:");
			accountNumber = ScannerUtility.getArithmeticInput();
			
			while(accountNumber != -1){ //Senteniel value, we are not sure how man account/customer the store has
				System.out.print("Enter Opening Balance :");
				beginBalance = ScannerUtility.getArithmeticInput();  
				
				System.out.print("Enter Total Items Charged:");  
				totalChanges = ScannerUtility.getArithmeticInput();
				
				if(totalChanges < 0){
					System.out.println("Total Item Charged cannot be less than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput();
					continue;
				}
				
				System.out.print("Enter Total Monthly Credit:");  
				monthlyCredit = ScannerUtility.getArithmeticInput();
				
				if(monthlyCredit < 0){
					System.out.println("Total Monthly Credit cannot be less than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput();
					continue;
				}
				
				System.out.print("Enter Credit Limit:");  
				creditLimit = ScannerUtility.getArithmeticInput();

				if(creditLimit <= 0){
					System.out.println("Credit Limit must be greater than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput();
					continue;
				}
				
				
				endBalance = (beginBalance + totalChanges) - monthlyCredit;			
				System.out.printf("Account %d Closing Balance:%d%n",accountNumber,endBalance);
				
				if(endBalance >  creditLimit){
					System.out.printf("*** Account %d exceeds credit limit ***%n",accountNumber);
				}
				
				System.out.println("====================================================");
	
				System.out.print("Enter Account Number or -1 to exit:");
				accountNumber = ScannerUtility.getArithmeticInput();
				
			}
		}catch(Exception x){
			System.out.print("Invalid Value Entered.  Exit Program.");
		}
		
	}

}  //End Credit Calculator
