package ch02;

public class Circle {
	private final double Pi = Math.PI;
	
	
	public void circleProperties()throws Exception{
		int radius = 0;
		
		
		while(radius <= 0){
			System.out.print("Enter radius:");
			radius = ScannerUtility.getArithmeticInput();
		}
		
		System.out.printf("Diameter:%d%nCircumference:%f%nArea:%f",
				calculateDiameter(radius),calculateCircumference(radius),
				calculateArea(radius));
	
		ScannerUtility.pressAnyKey();
	}
	
	private int calculateDiameter(int radius){
		return 2 * radius;
	}
	
	private double calculateCircumference(int radius){
		return 2 * Pi * radius;
	}
	
	private double calculateArea(int radius){
		return Pi * (radius * radius);
	}
}
