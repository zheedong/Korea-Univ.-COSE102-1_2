package Exercise;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int time = scan.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.print(time + "�� = ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "��");

		scan.close();
	}
}
