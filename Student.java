package assignmentWeek3Day1;

public class Student extends Department {
	
	public static void main(String[] args) {
		
		Department dep = new Department();
		dep.collegename();
		dep.collegecode();
		dep.collegeRank();
		dep.deptName();
	
	}
	
	public void studentName() {
		System.out.println("Dhilip Sudhan");
	}
	public void studentDept() {
		System.out.println("Computer Technology");
	}
	public void studentId() {
		System.out.println("12234");
	}
	
	
}
