class ExtThread extends Thread {
	ExtThread() {
		super("���������������� �����: ");
		System.out.println("�������� �����: " + this);
		start();
	}
	public void run(){
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("�������� �����: " + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("�������� ����� �������");
		}
		System.out.println("�������� ����� ��������");
	}
}
public class AnnotherThread {

	
	public static void main(String[] args) {
		new ExtThread();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("������� ����� : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
		System.out.println("������� ����� ��������: ");

	}

}
