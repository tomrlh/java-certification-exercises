public class Precedence {
	public static void main(String[] args) {
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println(20 / 3);
	}
}