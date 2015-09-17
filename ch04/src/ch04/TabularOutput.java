package ch04;

public class TabularOutput {

	public static void main(String[] args) {
		int j = 1;		
		System.out.println("N\t10*N\t100*N\t1000*N"); //Output the heading note the tab position.
		
		while(j <= 5){
			System.out.printf("%d\t%d\t%d\t%d%n",j,(j*10),(j*100),(j*1000));
			j++;
		}

	}

} //End TabularOutput
