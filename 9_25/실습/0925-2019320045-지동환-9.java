package exercise;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String args[]) {
		int month = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("�� �Է� [1-12] : ");
			month = scan.nextInt();
		} while (month < 1 || month > 12);
		System.out.print("����� �Է� : " + month + "��");
	}
}
