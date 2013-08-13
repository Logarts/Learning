package base;


public class Usage {

	public static void main(String[] args) {
		Lifo myStack = new Lifo(10);
		
		try {
			int length = myStack.getLength();
			for (int i = 0; i < length; i++) {
				if (myStack.insert(i)) {
					myStack.getStack();
					System.out.println("Inserting: " + i);
					Thread.sleep(1000);
				} else {
					System.out.println("Stack is full!");
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread error!");
		}
		
		try {
			int position = myStack.getPosition();
			for (int i = 0; i <= position; i++) {
				int value = myStack.get();
				if (value != 99999) {
					System.out.println("Getting: " + value);
					myStack.getStack();
					Thread.sleep(1000);
				} else {
					System.out.println("Stack empty!");
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread error!");
		}

	}

}
