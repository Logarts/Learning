
class Stck {
	private int stack[] = new int[10];
	private int position;
	Stck() {
		position = -1;
	}
	public void insert (int item) {
		if (position == 9) {
			System.out.println("Stack full!");
		} else {
			stack[++position] = item;
		}
	}
	public int get () {
		if (position < 0) {
			System.out.println("Stack is empty!");
			return 0;
		} else {
			return stack[position--];
		}
	}
}
