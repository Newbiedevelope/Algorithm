package chapter5;

import java.util.Scanner;

public class Hanoi {

	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.printf("����[%d]��(��) %d�� ��տ��� %d�� ������� �ű�\n", no, x, y);

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ϳ����� ž");
		System.out.print("������ ����:");
		int n = stdIn.nextInt();

		move(n, 1, 3);
	}
}
