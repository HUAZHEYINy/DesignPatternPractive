package Chap5SingletonPattern;

public class main {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int threadNo = 1000000;
		main m = new main();
		
		for (int i = 0; i < threadNo; i++) {
			runtest r = m.new runtest();
			r.run();
		}
		
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime - startTime);
	}
	
	
	public class runtest implements Runnable {
		public runtest() {
		}
		public void run() {
			Singleton_4.getSingleton();
		}
	}
}

