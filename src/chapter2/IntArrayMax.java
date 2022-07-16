package chapter2;

public class IntArrayMax {
	public static void main(String[] args) {
		int[] a = new int[3];

		int max;
		max = a[0];

		for (int i = 0; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
	}
}
