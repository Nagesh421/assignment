public abstract class Employee {

	public abstract int getSalary();

	public abstract void setSalary(int salary);

	public abstract String getGrade();

	public abstract void setGrade(String grade);
	

	public void label() {
		System.out.println("Employee's data:\n" );
		printEmployee(getGrade(),getSalary());
	}
	
	public void printEmployee(String grade, int salary) {
		
		System.out.println("GRADE : " + grade);
		System.out.println("Salary : " + salary);
	}
	
	
}
