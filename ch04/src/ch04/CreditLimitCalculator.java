package ch04;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		//Declare and initialize method variables
		int accountNumber = 0;  //Account Number
		int beginBalance = 0;  //Opening Balance
		int totalChanges = 0; //Charges
		int monthlyCredit = 0; //Monthly Credit
		int creditLimit = 0; //Credit Limit Allowed
		int endBalance = 0;  //Closing Balance
		
		try{
			System.out.print("Enter Account Number or -1 to exit:");
			accountNumber = ScannerUtility.getArithmeticInput();
			
			while(accountNumber != -1){ //Sentenel value, we are not sure how man account/customer the store has
				System.out.print("Enter Opening Balance :");  
				beginBalance = ScannerUtility.getArithmeticInput();  //Get value  
				
				System.out.print("Enter Total Items Charged:");  
				totalChanges = ScannerUtility.getArithmeticInput(); //Get value
				
				if(totalChanges < 0){  //Ensure user does not enter less than zero value
					System.out.println("Total Item Charged cannot be less than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput();
					continue;
				}
				
				System.out.print("Enter Total Monthly Credit:");  
				monthlyCredit = ScannerUtility.getArithmeticInput(); //Get Value
				
				if(monthlyCredit < 0){ //Ensure user does not enter less than zero value
					System.out.println("Total Monthly Credit cannot be less than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput(); //Get Value
					continue;
				}
				
				System.out.print("Enter Credit Limit:");  
				creditLimit = ScannerUtility.getArithmeticInput(); //Get value

				if(creditLimit <= 0){
					System.out.println("Credit Limit must be greater than 0.");

					System.out.println("====================================================");
					
					System.out.print("Enter Account Number or -1 to exit:");
					accountNumber = ScannerUtility.getArithmeticInput(); //Get Value
					continue;
				}
				
				
				endBalance = (beginBalance + totalChanges) - monthlyCredit;	//Calculate closing balance		
				System.out.printf("Account %d Closing Balance:%d%n",accountNumber,endBalance);
				
				if(endBalance >  creditLimit){  //Check balance against credit limite
					System.out.printf("*** Account %d exceeds credit limit ***%n",accountNumber);
				}
				
				System.out.println("====================================================");
	
				System.out.print("Enter Account Number or -1 to exit:");
				accountNumber = ScannerUtility.getArithmeticInput();  //Get value, this control when you are in the loop
				
			}
		}catch(Exception x){ //Exception for any abnormality.
			System.out.print("Invalid Value Entered.  Exit Program.");
		}
		
	}

}  //End Credit Calculator
