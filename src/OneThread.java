
public class OneThread implements Runnable {
	int number;
	Thread t;
	OneThread(int n) {
		t = new Thread(this, "�������� �����");
		number = n;
		System.out.println("�������� ����� " + number + " ������");
		t.start();
	}
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("�������� ����� " + number + ": " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("�������� ����� " + number + " �������");
		}
		System.out.println("�������� ����� " + number + " ��������");
	}
	
}
