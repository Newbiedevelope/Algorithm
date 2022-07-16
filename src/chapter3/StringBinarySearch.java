package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[] x = { // 자바에서 사용하는 기본적인 자료형
				"boolean", "char", "double", "float", "int", "long", "short", "String" };

		System.out.print("원하는 키워드를 입력하세요.:");
		String ky = stdIn.next();

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는  [" + idx + "]에 있습니다.");
	}
}
