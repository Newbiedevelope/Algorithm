package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[] x = { // �ڹٿ��� ����ϴ� �⺻���� �ڷ���
				"boolean", "char", "double", "float", "int", "long", "short", "String" };

		System.out.print("���ϴ� Ű���带 �Է��ϼ���.:");
		String ky = stdIn.next();

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0)
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		else
			System.out.println("�ش� Ű�����  [" + idx + "]�� �ֽ��ϴ�.");
	}
}
