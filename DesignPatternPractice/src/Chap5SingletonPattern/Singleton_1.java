package Chap5SingletonPattern;

/**
 * Non thread safe.
 * @author huazhe
 *
 */
public class Singleton_1 {
	private static Singleton_1 instance;
	
	private Singleton_1() {}
	
	public static Singleton_1 getSingleton() {
		if (instance == null) {
			instance = new Singleton_1();
		}
		
		return instance;
	}
}
