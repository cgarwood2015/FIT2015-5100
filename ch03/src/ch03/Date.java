package ch03;

/**
 * Class			Date
 * Methods:  		displayDate - Method to add to account
 * 					getters and setters
 * 
 * Exceptions:		NONE
 * 					  
 * 
 */


public class Date{
	private int day; //instance variable
	private int month; //instance variable
	private int year; //instance variable

	public Date(int day, int month,int year) {
		this.day = day; //Use contructor to set value
		this.month = month; //Use contructor to set value
		this.year = year; //Use contructor to set value
	}

	/*Getter Method for instance variable(s)*/
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	/*Getter Method for instance variable(s)*/
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	/*Getter Method for instance variable(s)*/
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//Method to display date
	//Note that the validation of the values are done here because it is here you try to form a date
	//from the separate values.
	public String displayDate(){
		System.out.println("The day:"+this.getDay());
		System.out.println("The month:"+this.getMonth());
		System.out.println("The year:"+this.getYear());
		
		if(this.getDay() <= 0 || this.getDay() > 31){     //day validation
			return "Invalid day.  Cannot display date value";
		}
		
		if(this.getMonth() <= 0 || this.getMonth() > 12){ //Month validation
			return "Invalid month.  Cannot display date value";
		}
		
		if(this.getYear() <= 0){  //year validation
			return "Invalid year.  Cannot display date value";
		}
		
		return this.getDay()+"/"+this.getMonth()+"/"+this.getYear();

	}
		                           
	
}  //End Class
