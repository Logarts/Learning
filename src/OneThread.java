
public class OneThread implements Runnable {
	int number;
	Thread t;
	OneThread(int n) {
		t = new Thread(this, "Дочерний поток");
		number = n;
		System.out.println("Дочерний поток " + number + " создан");
		t.start();
	}
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток " + number + ": " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток " + number + " прерван");
		}
		System.out.println("Дочерний поток " + number + " завершен");
	}
	
}
