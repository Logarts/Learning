

public class Threads {
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("������� �����: " + t);
		t.setName("��� Thread");
		System.out.println("������� �����: " + t);
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
	}
}