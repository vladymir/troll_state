package entity;

import statemachine.State;
import statemachine.Telegram;

public class SleepingState implements State<Troll> {

	@Override
	public void enter(Troll entity) {
		System.out.println(entity.name + ": Taking a nap!");
	}

	@Override
	public void execute(Troll entity) {
		System.out.println(entity.name + ": ZzzZZzzzzzZZZzZZ");
		entity.increaseStamina();
		if(entity.getStamina() == 10) {
			entity.changeState(new HuntingState());
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
		System.out.println(entity.name + ": Waking up!!");
	}

	@Override
	public boolean onMessage(Telegram msg) {
		return false;
	}

}
