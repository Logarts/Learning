package base;

public class Usag {

	public static void main(String[] args) {
		Fifo myQueue = new Fifo(10);
		
		try {
			int length = myQueue.getLength();
			for (int i = 0; i < length; i++) {
				myQueue.insert(i);
				myQueue.getQueue();
				System.out.println("Inserting: " + i);
				Thread.sleep(1000);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insert error: " + e + "!");
		} catch (InterruptedException e) {
			System.out.println("Thread error!");
		}
		
		try {
			int position = myQueue.getPosition();
			for (int i = 0; i <= position; i++) {
				System.out.println("Getting: " + myQueue.get());
				myQueue.getQueue();
				Thread.sleep(1000);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Get error: " + e + "!");
		} catch (InterruptedException e) {
			System.out.println("Thread error!");
		}

	}

}
