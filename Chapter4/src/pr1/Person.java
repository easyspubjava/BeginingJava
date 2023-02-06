package pr1;

public class Person {

	String name;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money+ "으로 " + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money+ "으로 " + message);
		}
	}
}
