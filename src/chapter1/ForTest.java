package chapter1;

import java.util.Scanner;
import chapter1.ForMethod;

public class ForTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Scanner stdIn2 = new Scanner(System.in);

		System.out.println("a��:");
		int a = stdIn.nextInt();
		System.out.println("b��:");
		int b = stdIn2.nextInt();

		System.out.println("a�� b ���� ��� ������ ����" + sumof(a, b) + "�Դϴ�.");

	}

	private static int sumof(int a, int b) {
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
