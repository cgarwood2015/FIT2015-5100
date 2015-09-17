package ch04;

import java.lang.Math;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		int accountNumber = 0;
		int beginBalance = 0;
		int totalChanges = 0;
		int totalCredit = 0;
		int monthlyCredit = 0;
		int creditLimit = 0;
		int endBalance = 0;
		int excess_creidt = 0;
		
		try{
			System.out.print("Enter Account Number or -1 to exit:");
			accountNumber = ScannerUtility.getArithmeticInput();
			
			while(accountNumber != -1){
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
				
				
				endBalance = (beginBalance) - ( totalChanges + monthlyCredit);			
				excess_creidt = creditLimit - endBalance;
				
				System.out.printf("Account %d Closing Balance:%d%n",accountNumber,endBalance);
				
				if(excess_creidt < 0){
					System.out.printf("*** Account %d exceeds credit limit(%d)%n ***",accountNumber,Math.abs(excess_creidt));
				}
				
				System.out.println("====================================================");
	
				System.out.print("Enter Account Number or -1 to exit:");
				accountNumber = ScannerUtility.getArithmeticInput();
				
			}
		}catch(Exception x){
			System.out.print("Invalid Value Entered.  Exit Program.");
		}
		
	}

}
