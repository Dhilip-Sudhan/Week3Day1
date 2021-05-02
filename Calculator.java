package assignmentWeek3Day1;

public class Calculator {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}
	
	
	public void multiply(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	public void multiply(int a, double b) {
		double c = a*b;
		System.out.println(c);
	}
	
	
	public void subtract(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
	public void subtract(double a, double b) {
		double c = a - b;
		System.out.println(c);
	}
	
	
	public void divide(int a, int b) {
		int c = a/b;
		System.out.println(c);
	}
	public void divide(int a, double b) {
		double c = a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(4, 4);
		calc.add(4, 3, 2);
		calc.subtract(10, 5);
		calc.subtract(5333334, 5333333);
		calc.multiply(5, 7);
		calc.multiply(4, 53344556);
		calc.divide(8, 4);
		calc.divide(4444444, 4);
	}
}

