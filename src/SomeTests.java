import java.util.Scanner;

class Calc {
	int x;
	int y;
	int result;
	Calc(int x, int y) {
		this.x = x;
		this.y = y;
		this.result = 0;
	}
	public void sum() {
		this.result = this.x + this.y;
		this.say("X + Y: ");
		this.show();
		
	}
	public void dev (int first, int second) {
		this.result = first - second;
		this.say("First - second: ");
		this.show();
	}
	public void inc() {
		this.result = this.x * this.y;
		this.say("X * Y: ");
		this.show();
	}
	public void del (int first, int second) {
		this.result = first / second;
		this.say("First / second: ");
		this.show();
	}
	private void show() {
		System.out.println(this.result);
	}
	private void say(String words) {
		System.out.print(words);
	}
	
	//Пример обхождения protected защиты; public оболочка, внутри исполение protected функции.
	public void magic(String w) {
		this.say(w);
	}
}
public class SomeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calc calc = new Calc(15, 2);
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		System.out.println(number);
	}

}
