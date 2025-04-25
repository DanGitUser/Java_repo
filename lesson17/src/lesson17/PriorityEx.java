package lesson17;

public class PriorityEx {
	public static void main(String[] args) {
		Prior prior1 = new Prior("First");
		Prior prior2 = new Prior("Second");
		prior1.setPriority(Thread.MIN_PRIORITY);
		prior2.setPriority(Thread.MAX_PRIORITY);
		prior1.start();
		prior2.start();
	}
}
class Prior extends Thread {
	public Prior (String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " :: " + getName());
		}
	}
	
}
