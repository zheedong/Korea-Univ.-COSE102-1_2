package exercise;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);

		System.out.print("�ʺ� �Է�:");
		rect.width = scanner.nextInt();
		System.out.print("���� �Է�:");
		rect.height = scanner.nextInt();

		System.out.println("�簢���� ����:" + rect.getArea());
		scanner.close();
	}

}
