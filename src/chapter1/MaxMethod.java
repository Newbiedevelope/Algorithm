package chapter1;

public class MaxMethod {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(5,2,1)" + max3(5, 2, 1));
		System.out.println("max3(1,7,1)" + max3(1, 7, 1));
		System.out.println("max3(1,2,3)" + max3(1, 2, 3));
	}
}
