
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of employees : ");
		int numOfEmp = scanner.nextInt();
		
		for (int i = 0; i < numOfEmp; i++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter TYPE_OF_EMPLOYEE : ");
			String typeofEmp = sc.nextLine();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter Grade  : ");
			String grade = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Enter Salary  : ");
			int salary = sc1.nextInt();
			 Employee emp = null;
			if(typeofEmp.equalsIgnoreCase("ENGINEER")) {
				emp = new Engineer(salary, grade);
			} else if (typeofEmp.equalsIgnoreCase("MANAGER")) {
				emp = new Manager(salary, grade);
			}
			emp.label();
		}
		//System.out.print("Enter Second Number : ");
		//int input2 = scanner.nextInt();
	}

}
