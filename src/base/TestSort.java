package base;

public class TestSort {
	public static void qSort (int array[]) {
		int low = 0;
		int high = array.length - 1;
		engine(array, low, high);
	}
	private static void engine(int array[], int low, int high) {
		int i = low;
		int j = high;
		int x = array[(low + high) / 2];
		do {
			while (array[i] < x) {
				i++;
			}
			while (array[j] > x) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		} while (i < j);
		if (low < i) {
			engine(array, low , i);
		}
		if (j < high) {
			engine(array, j, high);
		}
	}
}
