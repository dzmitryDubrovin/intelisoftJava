package com.lapa.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class homeworkMass {

	public static void main(String[] args) {
		boolean a = true;
		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList<String>();
		while (a) {
			System.out.println("�� � ��������� ���� ��� ������� �������� help");
			String menu = scan.nextLine();

			if (menu.equals("help")) {
				System.out.println("madd - �������� ������ � ������");
				System.out
						.println("mid -  �������� ��������� ������� �� �������");
				System.out
						.println("midsv - ������ ��������� � ������� �� ������� ");
				System.out
						.println("middel - ������� ������� ������� �� �������");
				System.out.println("mshow - ����� ������� � �������");
				System.out.println("menu - ����� � ����");
				System.out.println("exit - �����");
				continue;
			}

			if (menu.equals("madd")) {
				madd(arr, a);

			} else if (menu.equals("mid")) {
				mid(arr, a);

			} else if (menu.equals("midsv")) {
				midsv(arr, a);

			} else if (menu.equals("middel")) {
				middel(arr, a);

			} else if (menu.equals("mshow")) {
				mshow(arr);

			} else if (menu.equals("exit")) {
				a = false;
			} else {
				System.out
						.println("����� ������� �� ������� � ��� ��� �������");

			}
		}
	}

	public static void madd(ArrayList arr, boolean a) {
		System.out.println("��������� � ���� ���������� �������");
		Scanner scan = new Scanner(System.in);
		String menu;

		boolean b = true;
		while (b) {
			System.out.print("��������� " + (arr.size() + 1)
					+ " ������� �������");
			menu = scan.nextLine();
			if (menu.equals("menu")) {
				b = false;
			} else if (menu.equals("exit")) {

				a = false;
				b = false;
			} else {
				arr.add(menu);
			}
		}
		return;
	}

	public static void mid(ArrayList arr, boolean a) {

		System.out
				.println("��������� � ���� ��������� ��������� ������� �� ID");
		System.out.println("����� � ������� - " + arr.size() + " ���������");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out.println("�������� ����� �� ���:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.println(v + " ������� ������� =" + arr.get(v - 1));
			}

		}

		return;
	}

	public static void midsv(ArrayList arr, boolean a) {

		System.out.println("��������� � ���� ������ ��������� ������� �� ID");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out
					.println("����� � ������� - " + arr.size() + " ���������");
			System.out.println("�������� ����� �� ���:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.print("������" + v + "������� ������� ��=");
				String vs = scan.nextLine();
				arr.set((v - 1), vs);
			}

		}

		return;
	}

	public static void middel(ArrayList arr, boolean a) {

		System.out.println("��������� � ���� �������� ��������� ������� �� ID");
		Scanner scan = new Scanner(System.in);

		boolean b = true;
		while (b) {
			System.out
					.println("����� � ������� - " + arr.size() + " ���������");
			System.out.println("������� ����� �� ���:");
			String s = scan.nextLine();
			if (s.equals("menu")) {
				b = false;
			} else if (s.equals("exit")) {
				a = false;
				b = false;
			} else {
				int v = Integer.valueOf(s);
				System.out.print("������� - " + v + " ������� �������");
				arr.remove(v - 1);
			}

		}

		return;
	}

	public static void mshow(ArrayList arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		return;
	}
}
