package ch02;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}
}
