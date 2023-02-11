package ch14;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return  num1 - num2;
	}
//
//	@Override
//	public void description() {
//		
//		System.out.println("사칙연산을 수행하는 계산기입니다.");
//	}

	

}
