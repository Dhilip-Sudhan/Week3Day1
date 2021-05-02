package assignmentWeek3Day1;

public class Students {

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(2345);
		stud.getStudentInfo(2345,"Dhilip");
		stud.getStudentInfo("xyz@gmail.com",1234567890);
		
		

	}
	
	public void getStudentInfo(int id) {
		
		System.out.println("Passing Only ID");
	
	}
	
	public void getStudentInfo(int id,String name) {
		
		System.out.println("Passing ID and Name");
	
	}

	public void getStudentInfo(String email, long PhoneNumber) {
	
		System.out.println("Passing email and Phone Number");

}

}
