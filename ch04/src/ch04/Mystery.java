package ch04;

public class Mystery {

	public static void main(String[] args) {
		int x = 1;  //method scope variable
		int total = 0; //method scope variable
		
		while(x <= 10){  //execute the loop 9 times
			int y = x * x; //declare y as a loop scope variable.  this variable is destroyed one the loop ends
			System.out.println("->"+y); //print y
			total += y; //Add the value of y to the total variable
			++x;  //This line increment x as a prefix increment, however, it does not have much effect as its the single line of command so it does not change the overall operation of the loop.
		}
		System.out.printf("->Total is %d%n",total);
		
	}

}  //End Mystery
