package ch03;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Mary","Jane",500);
		Employee employee2 = new Employee("Jake", "Tapper",50000);
		
		System.out.printf("%s %s Salary Monthly:%.2f   Yearly:%.2f  %n",employee1.getFsName(),employee1.getLsName(),employee1.getMthSalary(), employee1.getYearlySalary());
		System.out.printf("%s %s Salary Monthly:%.2f   Yearly:%.2f  %n",employee2.getFsName(),employee2.getLsName(),employee2.getMthSalary(), employee2.getYearlySalary());
		System.out.println("");
		System.out.println("");
		
		//Grant 10% increase
		employee1.raiseSalary(10);  //Increate salary by 10%
		employee2.raiseSalary(10);  //Increate salary by 10%
		
		System.out.println("Salary After 10% increse:");
		System.out.printf("%s %s Salary Monthly:%.2f   Yearly:%.2f  %n",employee1.getFsName(),employee1.getLsName(),employee1.getMthSalary(), employee1.getYearlySalary());
		System.out.printf("%s %s Salary Monthly:%.2f   Yearly:%.2f  %n",employee2.getFsName(),employee2.getLsName(),employee2.getMthSalary(), employee2.getYearlySalary());
		System.out.println("");
		System.out.println("");
	}

}
