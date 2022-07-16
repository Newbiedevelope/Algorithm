package chapter6;

import java.util.Scanner;

public class ShellSort {

	static void shellSort(int[] a, int n) {
		int h;
		for (h = 1; h < n; h = h * 3 + 1);
		
		System.out.println(" h : " + h);
		
		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j = 0;
				int tmp = a[i];
				
				System.out.println("tmp >>> " + tmp);
				
				System.out.println("a[j] > tmp >>> " + (a[j] > tmp));
				
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					
					System.out.println(" j >= 0 >>> " +  j);
					
					a[j + h] = a[j];
				}
					
				a[j + h] = tmp;
			}
		}
			
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
 
		int nx = 7;
		int[] x = new int[] {6,4,3,7,1,9,8};
 
		shellSort(x, nx);

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + " ] = " + x[i]);
	}
	
//
//		System.out.println("�� ����(���� 1)");
//		System.out.print("��ڼ�:");
//		int nx = stdIn.nextInt();
//		int[] x = new int[nx];
//
//		for (int i = 0; i < nx; i++) {
//			System.out.print("x[" + i + "]:");
//			x[i] = stdIn.nextInt();
//		}
//
//		shellSort(x, nx);
//
//		System.out.println("������������ �����߽��ϴ�.");
//		for (int i = 0; i < nx; i++)
//			System.out.println("x[" + i + " ] = " + x[i]);
//	}
}
