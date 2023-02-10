package problem;

public class Q3 {

	public static void main(String[] args) {
	
		int dan;
		int times;
		
		for(dan =2; dan<=9; dan++) {
			
			for(times = 1; times <= dan; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
		
			System.out.println();
		}
	}
}
