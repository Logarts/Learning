
public class Test {
	public static void main(String[] args) {
		Stck stk = new Stck();
		for (int i = 0; i < 11; i++) {
			stk.insert(10 * (i + 1));
			System.out.println("Insert " + (10 * (i + 1)) + " in stack");
		}
		for (int i = 0; i < 11; i++) {
			System.out.println("Get " + stk.get() + " from stack");
		}
	}
}
