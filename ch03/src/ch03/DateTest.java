package ch03;

public class DateTest {
	
	public static void main(String[] args) {
		//Make sure you full qualify the Date class as java already have a date object
		//in its library java.util.Date
		ch03.Date dt = new ch03.Date(8,9,2015);  
		
		System.out.printf("The date is:%s %n",dt.displayDate());
		dt.setDay(-2);
		dt.setMonth(12);
		dt.setYear(2015);
		
		System.out.printf("The date is:%s %n",dt.displayDate());
		
		
		dt.setDay(03);
		dt.setMonth(12);
		dt.setYear(2015);
		
		System.out.printf("The date is:%s %n",dt.displayDate());
		
		dt.setDay(35);
		dt.setMonth(8);
		dt.setYear(2015);
		
		System.out.printf("The date is:%s %n",dt.displayDate());

		dt.setDay(29);
		dt.setMonth(15);
		dt.setYear(2015);
		
		System.out.printf("The date is:%s %n",dt.displayDate());
		
		dt.setDay(29);
		dt.setMonth(7);
		dt.setYear(-5);
		
		System.out.printf("The date is:%s %n",dt.displayDate());
		
	}	
}
