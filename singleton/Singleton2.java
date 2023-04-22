public class Singleton2 {
	private Singleton2() {}

	private static volatile Singleton2 instance;

	private static Object mutex = new Object();

	public static Singleton2 getInstance() {
		Singleton2 result = instance;

		if(result == null) {
			synchronized(mutex) {
				result = instance;

				if(result == null) {
					instance = result = new Singleton2();
				}
			}
		}

		return result;
	}
}

// Thread safe Singleton
