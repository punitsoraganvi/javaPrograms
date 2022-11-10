//to print num from 1 to 10
class Recursion1 {
	public static void print(int n) {
		System.out.println(n);
		n++;
		if (n == 11) {
			return;
		}
		print(n);
		// System.out.println(n);

	}

	public static void main(String[] args) {
		System.out.println("main begin");
		print(1);
		System.out.println("main end");
	}
}
