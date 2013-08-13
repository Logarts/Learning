package base;

public class Fifo {
	private int array[];
	int safeLength;
	int position;
	Fifo(int length) {
		array = new int[length];
		safeLength = length - 1;
		position = -1;
	}
	public void insert(int value) {
		if (position < safeLength) {
			array[++position] = value;
		} else {
			throw new ArrayIndexOutOfBoundsException("Queue is full");
		}
	}
	public int get() {
		if (position >= 0) {
			int value = array[0];
			for (int i = 0; i < position; i++) {
				array[i] = array[i+1];
			}
			if (position != 0) {
				array[position - 1] = array[position];
				array[position] = 0;
			} else {
				array[position] = 0;
			}
			position--;
			return value;
		} else {
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
	}
	public int getLength() {
		return array.length;
	}
	public int getPosition() {
		return position;
	}
	public void getQueue() {
		for (int i = 0; i < safeLength + 1; i++) {
			System.out.print(array[i]);
		}
		System.out.println(" ");
	}
}
