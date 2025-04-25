package lesson17;

public class ThreadEx {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread myThread = new MyThread();
		myThread.run();
//		Thread thread = new Thread(new MyRunnable());
//		myThread.start();
		System.out.println("main end");
		
	}
}
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " :: Thread");
		}
	}
}