package exercise;

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int buf = 0;
		int count = 0;
		double ave = 0;

		System.out.print("���� �Է�(����:-1) : ");
		while (true) {
			buf = scan.nextInt();

			if(buf == -1)
				break;

			ave += buf;
			count++;
		}
		ave /= count;
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("������ ���� = " + count + "��");
			System.out.println("��� = " + ave);
		}
	}

}