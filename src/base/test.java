package base;
import java.util.Random;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[1000];
		Random rand = new Random();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			array[i] = rand.nextInt(1000);
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		Sort.bSort(array);
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
