import java.util.Random;
class Sort {
	public void qSort(int[] sarray, int low, int high) {
		int i = low;
		int j = high;
		int x = sarray[(low+high)/2];
		do {
	          while(sarray[i] < x) ++i;  // поиск элемента для переноса в старшую часть
	          while(sarray[j] > x) --j;  // поиск элемента для переноса в младшую часть
	          if(i <= j){           
	              // обмен элементов местами:
	              int temp = sarray[i];
	              sarray[i] = sarray[j];
	              sarray[j] = temp;
	              // переход к следующим элементам:
	              i++; j--;
	          }
	      } while(i < j);
	      if(low < j) this.qSort(sarray, low, j);
	      if(i < high) this.qSort(sarray, i, high);
	}
}
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < 5; i++) {
			Random rand = new Random();
			int x;
			x = rand.nextInt(9);
			int temp = array[i];
			array[i] = array[x];
			array[x] = temp;			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
		Sort s = new Sort();
		s.qSort(array, 0, 9);
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
		
		
	}
	

}
