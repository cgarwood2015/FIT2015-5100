package ch02;
/**
 * Class			ArithmeticOper
 * Methods:  		printArithmetics - Takes two integers and Display Sum, Product, Diff and Quotient
 * 					calculateSum - Return the sum of two integers
 * 					calculateProduct - Return the product of two integers
 * 					calculateDifference - Return the difference for two integers
 * 					calculateQuotient - Return the quotient of two integers.
 * 
 * Exceptions:		Exceptions throws general exception for the calling function to handle
 * 					  
 * 
 */
public class ArithmeticOper {
	
	public void printArithmetics()throws Exception{
		
		int oneArith = 0;
		int twoArith = 0;
		int sum = 0;
		int prod = 0;
		int diff = 0;
		int quot = 0;
		
		System.out.print("Enter first integer:");
		oneArith = ScannerUtility.getArithmeticInput();
		
		System.out.print("Enter second integer:");
		twoArith = ScannerUtility.getArithmeticInput();
		
		sum = calculateSum(oneArith,twoArith);
		System.out.printf("Sum is:%d%n",sum);
		
		prod = calculateProduct(oneArith,twoArith);
		System.out.printf("Product is:%d%n",prod);
		
		diff = calculateDifference(oneArith,twoArith);
		System.out.printf("Difference is:%d%n",diff);

		try{
			quot = calculateQuotient(oneArith,twoArith);
			System.out.printf("Quotient is:%d",quot);
		}catch(ArithmeticException e){
			System.out.println("Unable to find the quotient of the two numbers");
		}
		catch(Exception x){
			System.out.println("An error has occurred with the current operation.");
		}
		ScannerUtility.pressAnyKey();
		
	}
	
	private int calculateSum(int fArith,int sArith){		
		return fArith + sArith;
	}
	
	private int calculateProduct(int fArith,int sArith){
		return fArith * sArith;
	}
	
	private int calculateDifference(int fArith,int sArith){
		return fArith - sArith;
	}
	
	private int calculateQuotient(int fArith,int sArith) throws Exception{
		return fArith / sArith;
	}

	
}
