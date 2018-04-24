package Chap5SingletonPattern;

/**
 * Thread safe but its expensive.
 * @author huazhe
 *
 */
public class Singleton_2 {
	private static Singleton_2 instance;
	
	private Singleton_2() {}
	
	public static synchronized Singleton_2 getSingleton() {
		if (instance == null) {
			instance = new Singleton_2();
		}
		
		return instance;
	}
}
