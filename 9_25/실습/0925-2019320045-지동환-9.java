package exercise;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String args[]) {
		int month = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("월 입력 [1-12] : ");
			month = scan.nextInt();
		} while (month < 1 || month > 12);
		System.out.print("사용자 입력 : " + month + "월");
	}
}
