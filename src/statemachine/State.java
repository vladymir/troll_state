package statemachine;

public interface State<T> {
	
	abstract void enter(T entity);
	abstract void execute(T entity);
	abstract void exit(T entity);

	abstract boolean onMessage(Telegram msg);
}
