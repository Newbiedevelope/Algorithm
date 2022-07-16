package chapter2;

import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;

	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10)
				dist[(int) (dat[i].vision * 10)]++;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		PhyscData[] x = { 
				new PhyscData("���� �ʺ�", 168, 1.2), 
				new PhyscData("��ȣ��", 175, 1.0),
				new PhyscData("���", 171, 0.2) 
				};
		int[] vdist = new int[VMAX];

		System.out.println("�ý�ü�˻� ����Ʈ��");
		System.out.println("�̸�        Ű        �÷�");
		System.out.println("----------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n��� Ű : %5.1fnm\n", aveHeight(x));

		distVision(x, vdist);

		System.out.println("\n�÷� ����");
		for (int i = 0; i < VMAX; i++)
			System.out.printf("%3.1f~ : %2d��\n", i / 10.0, vdist[i]);
	}
}
