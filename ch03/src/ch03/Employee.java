package ch03;

/**
 * Class			Employee
 * Methods:  		getYearlySalary - Method to add to account
 * 					raiseSalary - Method to withdraw from account
 * 					getters and setters
 * 
 * Exceptions:		NONE
 * 					  
 * 
 */


public class Employee {
	
	private String fsName;//Instance variable to hold the first name
	private String lsName; //Instance variable to hold the last name
	private double mthSalary; //Instance variable to hold the monthly salary
	
	
	
	public Employee(String fsName,String lsName,double mthSalary) {
		this.fsName = fsName; //Use constructor to set first name
		this.lsName = lsName; //Use constructor to set last name
		this.mthSalary = mthSalary; //Use constructor to set monthly salary
	
	}
	
	/*Getter Method for instance variable(s)*/
	public String getFsName() {
		return fsName;
	}
	public void setFsName(String fsName) {
		this.fsName = fsName;
	}
	/*Getter Method for instance variable(s)*/
	public String getLsName() {
		return lsName;
	}
	public void setLsName(String lsName) {
		this.lsName = lsName;
	}
	/*Getter Method for instance variable(s)*/
	public double getMthSalary() {
		return mthSalary;
	}
	public void setMthSalary(double mthSalary) {
		if(mthSalary > 0)
			this.mthSalary = mthSalary;
	}
	/*Getter Method for instance variable(s)*/
	public double getYearlySalary(){
		return this.getMthSalary() * 12;
	}
	
	//Method to raise salary, multiple 1.0f to be able to return a floating point from an integer.
	public void raiseSalary(int percentIncrease){
		if(this.getMthSalary() > 0 && percentIncrease > 0){  //both mthly salary and percentage increase must be valid.  Use short circuit &&
			double raise = this.mthSalary + (percentIncrease * 1.0f/100 * this.mthSalary);
			this.mthSalary = raise;
		}
	}
	
}  //End Class
