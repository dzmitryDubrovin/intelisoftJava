package box;

import java.util.Scanner;

public class Logick {
	int r = 0;
	Scanner scan = new Scanner(System.in);
	private boolean isFlag = true;	
	private Client Usern;
	private Bank bank;

	public Logick() {
		Usern = new Client();
		bank = new Bank();
	}

	public void start() {
		isFlag = true;
		System.out.println("1.������");
		System.out.println("2.����������");
		int r = scan.nextInt();
		if (r == 1) {			
			RunClient();
		} else if (r == 2) {
			
			Incas();
		}
	}

	public void RunClient() {
		if (bank.isOnline()) {
			while (isFlag) {

				// ������
				
					Usern.Cli();
					System.out.println("������");
					System.out.println("����� ��������");
					System.out.println("1.������ �����");
					System.out.println("2.�������� �������");
					System.out.println("3.zalit vedro");
					System.out.println("4. Exit");
					int t = scan.nextInt();
					switch (t) {
					case 1:

						System.out.println("������� �����");
						int snmoney = scan.nextInt();
						if (bank.getMoney() < snmoney) {
							System.out.println("���� ��������");
						} else if (Usern.getMoney() < snmoney) {
							System.out.println("you nis4ebrod");
						} else {
							Usern.setMoney(Usern.getMoney() - snmoney);
							bank.setMoney(bank.getMoney() - snmoney);
							System.out.println("Finishen");
						}

						break;
					case 2:
						System.out.println("��� = " + Usern.getUser());
						System.out.println("������� = " + Usern.getMoney());
						break;
					case 3:
						System.out.println("������� �����");
						int snsmoney = scan.nextInt();
						Usern.setMoney(Usern.getMoney() + snsmoney);
						bank.setMoney(bank.getMoney() + snsmoney);
						break;
					case 4:
						isFlag = false;
						break;

					default:
						break;
					}
				}
			

		} else {
			System.out.println("off");

		}
		start();
	}

	public void Incas() {
		while (isFlag) {
			System.out.println("1.���������� �����");
			System.out.println("2. ��������������������");
			System.out.println("3. Exit");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				System.out.println("������� ����� ����������");
				int snmoney = scan.nextInt();
				bank.setMoney(bank.getMoney() + snmoney);
				break;
			case 2:
				System.out.println("����� ������");
				System.out.println("1. offline");
				System.out.println("2 online");
				int j = scan.nextInt();
				switch (j) {
				case 1:
					bank.setOnline(false);
					break;
				case 2:
					bank.setOnline(true);
					break;

				}
				break;
			case 3:
				isFlag = false;
				break;
			}
		}
		start();
	}

}
