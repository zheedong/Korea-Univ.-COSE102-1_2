package exercise;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;

		System.out.print("������ ����? ");
		count = scan.nextInt();

		for (int i = 0; i < count; i++) {
			int number = (int) (Math.random() * 100);
			sum += number;
			System.out.println("���� : " + number);
		}

		System.out.println("���� : " + count + "���� �� = " + sum);

	}

}
