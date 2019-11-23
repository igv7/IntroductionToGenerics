package enums;

//J2SE 1.5 has a built in enum types support
public class Client {
	public enum State {AVILABLE,AWAY,OFFLINE}
	
	private State currState = null;

	public Client() {
		currState = State.OFFLINE;
	}
	
}