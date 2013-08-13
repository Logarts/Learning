

public class Threads {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Текущий поток: " + t);
		t.setName("Мой Thread");
		System.out.println("Текущий поток: " + t);
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
	}
}