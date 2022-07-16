package chapter8;

import java.util.Scanner;
import java.util.Comparator;

public class LinkedListTester {
	static Scanner stdIn = new Scanner(System.in);

	static class Data {
		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		public String toString() {
			return "(" + no + ")" + name;
		}

		void scanData(String guide, int sw) {
			System.out.println(guide + "�� �����͸� �Է��ϼ���.");

			if ((sw & NO) == NO) {
				System.out.print("��ȣ:");
				no = stdIn.nextInt();
			}

			if ((sw & NAME) == NAME) {
				System.out.print("�̸�:");
				name = stdIn.next();
			}
		}

		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

		private static class NoOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
			}
		}

		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

		private static class NameOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return d1.name.compareTo(d2.name);
			}
		}
	}

	enum Menu {
		ADD_FIRST("�Ӹ��� ��带 ����"), ADD_LAST("������ ��带 ����"), RMV_FIRST("�Ӹ� ��带 ����"), RMV_LAST("���� ��带 ����"),
		RMV_CRNT("���� ��带 ����"), CLEAR("��� ��带 ����"), SEARCH_NO("��ȣ�� �˻�"), SEARCH_NAME("�̸����� �˻�"),
		NEXT("���� ��带 �ϳ� �������� ����"), PRINT_CRNT("���� ��带 ���"), DUMP("��� ��带 ���"), TERMINATE("����");

		private final String message;

		static Menu MenuAt(int idx) {
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {
			message = string;
		}

		String getMessage() {
			return message;
		}
	}

	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = stdIn.nextInt();
		} while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();

		LinkedList<Data> list = new LinkedList<Data>();

		do {
			switch (menu = SelectMenu()) {

			case ADD_FIRST:
				data = new Data();
				data.scanData("�Ӹ��� ����", Data.NO | Data.NAME);
				list.addFirst(data);
				break;

			case ADD_LAST:
				data = new Data();
				data.scanData("������ ����", Data.NO | Data.NAME);
				list.addLast(data);
				break;

			case RMV_FIRST:
				list.removeFirst();
				break;

			case RMV_LAST:
				list.removeLast();
				break;

			case RMV_CRNT:
				list.removeCurrentNode();
				break;

			case SEARCH_NO:
				temp.scanData("�˻�", Data.NO);
				ptr = list.search(temp, Data.NO_ORDER);
				if (ptr == null)
					System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
				else
					System.out.println("�˻� ����" + ptr);
				break;

			case SEARCH_NAME:
				temp.scanData("�˻�", Data.NAME);
				ptr = list.search(temp, Data.NAME_ORDER);
				if (ptr == null)
					System.out.println("�� �̸��� �����Ͱ� �����ϴ�.");
				else
					System.out.println("�˻� ����" + ptr);
				break;

			case NEXT:
				list.next();
				break;

			case PRINT_CRNT:
				list.printCurrentNode();
				break;

			case DUMP:
				list.dump();
				break;

			case CLEAR:
				list.clear();
				break;
			}
		} while (menu != Menu.TERMINATE);
	}
}
