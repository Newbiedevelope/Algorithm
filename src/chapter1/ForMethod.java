package chapter1;

public class ForMethod {
	public static int sumof(int a, int b) {
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			return sum;
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
			return sum;
		} else
			return a;
	}
}
