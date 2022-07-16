package chapter5;

import java.util.Scanner;

public class EuclidGCD {

	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ �ִ������� ���մϴ�.");

		System.out.print("������ �Է��ϼ���:");
		int x = stdIn.nextInt();

		System.out.print("������ �Է��ϼ���:");
		int y = stdIn.nextInt();

		System.out.println("�ִ�������" + gcd(x, y) + "�Դϴ�.");
	}
}
