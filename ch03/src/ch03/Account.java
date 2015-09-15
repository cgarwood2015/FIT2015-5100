package ch03;


/**
 * Class			Account
 * Methods:  		deposit - Method to add to account
 * 					withdrawal - Method to withdraw from account
 * 					getters and setters
 * 
 * Exceptions:		NONE
 * 					  
 * 
 */

public class Account {
	private String name; //Instance variable to hold the name
	private double balance; //Instance variable to hold the current balance
	
	//Account contructor, takes name and balance
	public Account(String name,double balance){
		this.name = name; //assign name to instance variable
		
		if(balance > 0.0)
			this.balance = balance;  //Assign balance to instance variable		
	}
	//Mehtod to add to account
	public void deposit(double depositAmount){
		if(depositAmount > 0.0)  //If the deposit amount is valid
			balance = balance + depositAmount; //add it to the balance
	}
	
	//Method to withdraw from account
	public void withdrawal(double withdrawalAmount){
		if(withdrawalAmount > 0.0){ //Ensure the withdrawal amount is valid
			if(withdrawalAmount < this.balance) //Take the withdrawal amount from the balance amount.
				this.balance = this.balance - withdrawalAmount;
		}
	}
	
	/*Getter Method for instance variable(s)*/
	public String getName() { 
		return name;
	}
	/*Setter Method for instance variable(s)*/
	public void setName(String name) {
		this.name = name;
	}

	/*Getter Method for instance variable(s)*/
	public double getBalance() {
		return balance;
	}

	/*Setter Method for instance variable(s)*/
	public void setBalance(double balance) {
		this.balance = balance;
	}
		
}  //End Class
