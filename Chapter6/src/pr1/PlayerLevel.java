package pr1;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		
		run();
		for(int j=0; j<count; j++) {
			jump();
		}
		turn();
	}
}
