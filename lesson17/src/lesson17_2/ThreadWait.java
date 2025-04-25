package lesson17_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWait {
	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		new Thread(new Cooker(table), "Chef").start(); // Cooker starts COOKING
		new Thread(new Customer(table, "Hamburger"), "전상현").start();
		new Thread(new Customer(table, "Pasta"), "김태훈").start();
		new Thread(new Customer(table, "Pizza"), "김지유").start();
		
//		Thread.sleep(10000);
//		System.exit(0);
	}
}

class Table {
	List<String> dishNames = new ArrayList<>(List.of("Hamburger", "Pizza", "Pasta"));
	final int MAX_FOOD = 10;

	List<String> dishes = new ArrayList<String>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();

	// add food to table
	public void add(String dish) {
		lock.lock();

		try {
			while (dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try {
					forCook.await(); // waiting for chef //wait
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}

			dishes.add(dish); // add food
			forCust.signal(); // notify
			System.out.println("Curent dish on table :: " + dishes);
		} finally {
			lock.unlock();

		}
	}

	// remove food from table
	public void remove(String dish) {
		lock.lock();

		try {
			while (dishes.isEmpty()) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					if (dish.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();// wake chef if sleeping
						return;
					}
				}
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try {
					forCust.await();
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		} finally {
			lock.unlock();
		}
	}

}

class Customer implements Runnable {
	Table table;
	String food;

	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name + " has eaten " + food);
		}
	}
}

class Cooker implements Runnable {
	Table table;

	public Cooker(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		while (true) {
			table.add(table.dishNames.get((int)(Math.random()*3)));
			try {
				Thread.sleep(20);
			} catch (Exception e) {}
		}
	}
}