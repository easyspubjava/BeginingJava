package ch04;

public class CutomerTest {

	public static void main(String[] args) {

		
		int price = 10000;
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		int cost = customerLee.calcPrice(price);
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;
		cost = customerKim.calcPrice(price);
		//System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");
		
		
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerName("Park");
		cost = customerPark.calcPrice(price);
		System.out.println(customerPark.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");
		
	
		
		
		
		
		
		
		
	}

}
