package ch16;

public class NestedLoopTest {

	public static void main(String[] args) {

		
		int dan;
		int times;
		
		for(dan=2 ; dan <=9; dan++) {
			
			for(times = 1; times<=9; times++) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				
			}
			System.out.println();
		}
		
		dan = 2;
		times = 1;
		while( dan <= 9) {
			times = 1;
			while(times <=9) {
				
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			
		}
		
	}

}
