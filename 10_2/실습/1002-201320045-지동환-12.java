package exercise_4;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int buf = 0;
		int total = 0;
		int index = 0;

		System.out.println("���� 3���� �Է��ϼ���");
		while (index != 3) {
			try {
				System.out.print("�Է�:");
				buf = scan.nextInt();
			} catch (Exception e) {
				System.out.println("���� �ƴ�! �ٽ� �Է��ϼ���!");
				scan.next();
				continue;
			}
			total += buf;
			index++;
		}
		System.out.println("�� = " + total);
		scan.close();
	}

}
