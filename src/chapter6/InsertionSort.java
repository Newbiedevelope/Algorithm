package chapter6;

import java.util.Scanner;

public class InsertionSort {

	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ܼ� ���� ����");
		System.out.print("��ڼ�:");
		int xn = stdIn.nextInt();
		int[] x = new int[xn];

		for (int i = 0; i < xn; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, xn);

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < xn; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}
}
