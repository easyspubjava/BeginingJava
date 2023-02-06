package ch06;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		
		super(customerId, customerName);
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		this.agentID = agentId;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public int getAgentId() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		return price - (int)(price *salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
	}
}
