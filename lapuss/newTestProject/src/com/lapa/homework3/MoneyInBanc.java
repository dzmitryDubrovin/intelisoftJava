package com.lapa.homework3;

import java.util.Scanner;

public class MoneyInBanc {

	private static Scanner scan = new Scanner(System.in);

	public static void MoneyAdd(Bancomat banc) {
		
		if (!banc.work && banc.bUser.equals("Admin")) {
			System.out.println("������� ����� �������� � ��������?");
			int a = scan.nextInt();
			banc.money = banc.money + a;
		} else {
			System.out.println("�� ������ ������������ ��� ����� ������ ��������");
		}

	}
}
