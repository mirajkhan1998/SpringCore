
public class Machine {
	private static Machine instance;

	private Machine() {

	}

	public static synchronized Machine getInstance() {
		if (instance == null) {
			instance = new Machine();
			return instance;
		}
		return instance;
	}
}
