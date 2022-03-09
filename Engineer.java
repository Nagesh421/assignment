public class Engineer extends Employee {

	private int salary;
	private String grade;

	public Engineer(int salary, String grade) {
		this.salary = salary;
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
