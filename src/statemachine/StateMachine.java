package statemachine;

public class StateMachine<T> {

	private T owner;
	private State<T> currentState;
	
	public StateMachine(T owner) {
		this.owner = owner;
		currentState = null;
	}
	
	public void setInitialState(State<T> initialState) {
		currentState = initialState;
	}
	
	public void changeState(State<T> newState) {
		currentState.exit(owner);
		currentState = newState;
		currentState.enter(owner);
	}
	
	public void update() {
		if(currentState != null) {
			currentState.execute(owner);
		}
	}
}
