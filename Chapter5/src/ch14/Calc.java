package ch14;

public interface Calc {

	public static final double PI = 3.14;
	int ERROR = -9999999;
	
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
		
	default void description() {
		myMethod();
		mystaticMethod();
		System.out.println("정수를 계산합니다. ");
	}

	private void myMethod() {
		System.out.println("private method");
	}
	
	static int total(int[] arr) {
		mystaticMethod();
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		
		return total;
	}
	
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
}
