package com.lapa.homework3;

import java.util.Scanner;

public class ChangeBancMode {
	private static Scanner scan = new Scanner(System.in);

	public static Bancomat Change1(Bancomat banc) {
		if (!banc.bUser.equals("Admin")) {
			System.out.println("���� ��������� ����� �����");
		} else {
			System.out.println("����� ����������������� ��������");
			if (banc.work) {
				System.out.println("�������� ��������� � ������� ������");
			} else {
				System.out.println("�������� ��������� � ������ ������������");
			}
			System.out.println("������� ����� ������ ���������?");
			System.out.println("y/n");
			String s = scan.nextLine();
			if (banc.bUser.equals("Admin")) {
				if (s.equals("y")) {
					banc.work = !banc.work;
					return banc;
				} else if (s.equals("n")) {
					return banc;
				}
			}
		}
		return null;
	}
}
