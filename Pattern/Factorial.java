class Factorial {
	public static void main(String[] args) {
		int n = 1;
		int fact = 1;
		while (n <= 3) {
			fact = fact * n;
			n++;
		}
		System.out.println(fact);
	}
}
