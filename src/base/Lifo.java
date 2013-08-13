package base;

public class Lifo {
	private int array[];
	private int position;
	private int safeLength;
	private final int ERROR_CODE = 99999;
	Lifo(int length) {
		array = new int[length];
		safeLength = length - 1;
		position = -1;
	}
	public boolean insert(int value) {
		if (position < safeLength) {
			array[++position] = value;
			return true;
		} else {
			return false;
		}
	}
	public int get() {
		if (position >= 0) {
			int value = array[position];
			array[position--] = 0;
			return value;
		} else {
			return ERROR_CODE;
		}
	}
	public int getLength() {
		return array.length;
	}
	public int getPosition() {
		return position;
	}
	public void getStack() {
		for (int i = 0; i < safeLength + 1; i++) {
			System.out.print(array[i]);
		}
		System.out.println(" ");
	}
}
