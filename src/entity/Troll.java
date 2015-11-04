package entity;

import statemachine.State;
import statemachine.StateMachine;

public class Troll {

	private StateMachine<Troll> fsm;
	public final String name;
	private int stamina;
	
	public Troll(String name) {
		this.name = name;
		fsm = new StateMachine<Troll>(this);
		stamina = 10;
		fsm.setInitialState(new HuntingState());
	}
	
	public void update() {
		fsm.update();
	}
	
	public void decreaseStamina() {
		stamina--;
	}
	
	public void increaseStamina() {
		stamina++;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void changeState(State<Troll> newState) {
		fsm.changeState(newState);
	}
}
