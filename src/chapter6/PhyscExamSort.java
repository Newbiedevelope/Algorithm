package chapter6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class PhyscExamSort {
	static class PhyscData {
		String name;
		int height;
		double vision;

		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("개발 초보", 168, 1.2), new PhyscData("간호사", 175, 1.0),
				new PhyscData("목사", 170, 0.3), new PhyscData("화가", 158, 0.7) };

		Arrays.sort(x, PhyscData.HEIGHT_ORDER);

		System.out.println("▣ 신체검사 리스트 ▣");
		System.out.println("이름          키          시력");
		System.out.println("--------------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	}

}
