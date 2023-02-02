package ch15;

public class ForTest {

	public static void main(String[] args) {

		
		int num=1;
		int sum=0;
		
		while ( num<= 10 ) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum);
		
		for(num = 1, sum=0; num<=10; num++) {
			
			sum += num;
			
		}
		System.out.println(sum);
	}

}
