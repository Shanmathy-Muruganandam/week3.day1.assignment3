package week3.day1.classassignments;

public class Calculator {
	
	int a = 2, b = 3, sum = 0;
	public void add() {
		sum = a + b;
		System.out.println("The sum of "+a+" & "+b+":\t"+sum);
	}
	public void add(int a, int b) {
		sum = a + b;
		System.out.println("The sum of "+a+" & "+b+":\t"+sum);
	}
	public void add(int a, int b, int c) {
		sum = a + b + c;
		System.out.println("The sum of "+a+", "+b+" & "+c+":\t"+sum);
	}
	public void add(float a, float b) {
		float sum = a + b;
		System.out.println("The sum of "+a+" & "+b+":\t"+sum);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.add(5,10);
		cal.add(5, 10, 15);
		cal.add(15.42f, 25.06f);
	}
}
