package base;


public class Sort {
	//"Быстрая" сортировка
	public static void qSort(int[] array) {
		int low = 0;
		int high = array.length - 1;
		engine(array, low, high);
	}
	private static void engine(int[] array, int low, int high) {
		int i = low;
		int j = high;
		int x = array[(low+high)/2];
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
				i++;
				j--;
			}
		} while (i < j);
		if (low < j) {
			engine(array, low, j);
		}
		if (i < high) {
			engine(array, i, high);
		}
	}
	//Сортировка Пузырьком
	public static void bSort (int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1; j ++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
