package Chap5SingletonPattern;

/**
 * Thread safe and not expensive. but may not be use once it get created.
 * @author huazhe
 *
 */
public class Singleton_3 {
	private static Singleton_3 instance = new Singleton_3();
	
	private Singleton_3() {}
	
	public static Singleton_3 getSingleton() {
		return instance;
	}
}
