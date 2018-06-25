package multithreading;

class Task2 implements Runnable {
	@Override
	public synchronized void run() {
		for (int i = 501; i <= 1000; i++) {
			System.out.println("Thread 2 = " + i);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ques1 extends Thread {

	@Override
	public synchronized void run() {
		for (int i = 1; i <= 500; i++) {
			System.out.println("Thread 1 = " + i);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ques1 obj = new ques1();
		Thread t1 = new Thread(obj);
		Task2 obj2 = new Task2();
		Thread t2 = new Thread(obj2);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}

}
