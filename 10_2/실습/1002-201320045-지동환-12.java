package exercise_4;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int buf = 0;
		int total = 0;
		int index = 0;

		System.out.println("정수 3개를 입력하세요");
		while (index != 3) {
			try {
				System.out.print("입력:");
				buf = scan.nextInt();
			} catch (Exception e) {
				System.out.println("정수 아님! 다시 입력하세요!");
				scan.next();
				continue;
			}
			total += buf;
			index++;
		}
		System.out.println("합 = " + total);
		scan.close();
	}

}
