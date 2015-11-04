import entity.Troll;

public class Main {

	public static void main(String[] args) {
		Troll troll = new Troll("Stone troll");
		Troll troll1 = new Troll("Wood troll");

		while(true) {
			troll.update();
			troll1.update();
		}
	}
}
