package enums;

//Old enum is Not type safe
public class Test {
	
	public static final int STATE_AVAILABLE = 0;
	public static final int STATE_AWAY = 1;
	public static final int STATE_OFFILNE = 2;
	
	public static void main(String[] args) {
		int currentState = 25;
		currentState = STATE_AWAY + STATE_OFFILNE;
		System.out.println(currentState);	
	}

}