package entity;

import statemachine.State;
import statemachine.Telegram;

public class HuntingState implements State<Troll>{

	@Override
	public void enter(Troll entity) {
		System.out.println(entity.name + ": Now I hunt!");
	}

	@Override
	public void execute(Troll entity) {
		System.out.println(entity.name + " Hunting");
		entity.decreaseStamina();
		if(entity.getStamina() == 0) {
			entity.changeState(new SleepingState());
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void exit(Troll entity) {
		System.out.println(entity.name + ": Im so tired");
	}

	@Override
	public boolean onMessage(Telegram msg) {
		return false;
	}

}
