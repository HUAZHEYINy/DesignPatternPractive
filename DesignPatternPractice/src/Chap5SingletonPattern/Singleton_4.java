package Chap5SingletonPattern;

/**
 * Thread safe, not expensive. and only get created once it has been used.
 * @author huazhe
 *
 */
public class Singleton_4 {
	private volatile static Singleton_4 instance;
	
	private Singleton_4() {}
	
	public static  Singleton_4 getSingleton() {
		if (instance == null) {
			synchronized(Singleton_4.class) {
				instance = new Singleton_4();
			}
		}
		
		return instance;
	}
}
