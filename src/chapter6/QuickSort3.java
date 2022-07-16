package chapter6;

import java.util.Scanner;

public class QuickSort3 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static int sort3elem(int[] x, int a, int b, int c) {
		if (x[b] < x[a])
			swap(x, b, a);
		if (x[c] < x[b])
			swap(x, c, b);
		if (x[b] < x[a])
			swap(x, b, a);
		return b;
	}

	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int m = sort3elem(a, pl, (pl + pr) / 2, pr);
		int x = a[m];

		swap(a, m, right - 1);
		pl++;
		pr -= 2;

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr)
			quickSort(a, left, pr);
		if (pl < right)
			quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.print("요솟수:");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx - 1);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
