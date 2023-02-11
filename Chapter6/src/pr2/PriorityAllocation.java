package pr2;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 가장 높은 call을 먼저 가져옵니다.");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 배분합니다.");
	}

}
