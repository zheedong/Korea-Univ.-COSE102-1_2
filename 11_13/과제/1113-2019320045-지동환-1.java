package assignment_1113;

import java.util.Scanner;

public class Assignment_01 { // Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetAnimal[] Pet = new PetAnimal[3]; // ��ü �迭
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int flow = 0;

		Pet[0] = new Cat("�����", "Black", "���� �� �ö󰡱�", "�߿�");
		Pet[1] = new Dog("������", "Gold", "��å �ϱ�", "�۸�");
		Pet[2] = new Turtle("�ź���", "Green", "������ �����ֱ�", " ");

		while (flag) {
			System.out.print("��ȣ ���� (1~3): ");
			flow = scan.nextInt();
			switch (flow) {
			case 1:
				Pet[0].Profile();
				break;
			case 2:
				Pet[1].Profile();
				break;
			case 3:
				Pet[2].Profile();
				break;
			default:
				flag = false;
				break;
			}
		}
		System.out.println("�����մϴ�.");
	}
}
