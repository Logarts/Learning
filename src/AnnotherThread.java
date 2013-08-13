class ExtThread extends Thread {
	ExtThread() {
		super("Демонстрационный поток: ");
		System.out.println("Дочерний поток: " + this);
		start();
	}
	public void run(){
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток: " + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван");
		}
		System.out.println("Дочерний поток завершен");
	}
}
public class AnnotherThread {

	
	public static void main(String[] args) {
		new ExtThread();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Главный поток : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Главный поток завершен: ");

	}

}
