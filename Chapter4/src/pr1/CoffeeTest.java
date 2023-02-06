package pr1;

public class CoffeeTest {

	public static void main(String[] args) {

		Person personKim = new Person("Kim", 10000);
		Person personLee = new Person("Lee", 20000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		personKim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		personLee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
		
		
	}

}
