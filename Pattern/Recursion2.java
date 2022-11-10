//to print factorial of num
class Recursion2 {
	public static void print(int n) {
		// System.out.println(n);

		if (n == 1) {
			return;
		} else {
			n = n * (n - 1);
			print(n);

		}

		System.out.println(fact);

	}

	public static void main(String[] args) {
		System.out.println("main begin");
		print(5);
		System.out.println("main end");
	}
}
