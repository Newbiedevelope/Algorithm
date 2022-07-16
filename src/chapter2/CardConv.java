package chapter2;

import java.util.Scanner;

public class CardConv {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPARSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����:");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36):");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno);

			System.out.print(cd + "������");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");

			System.out.print("�� �� �� �ұ��? (1. ��/2. �ƴϿ�)");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
