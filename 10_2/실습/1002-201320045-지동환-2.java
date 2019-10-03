package exercise_4;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 5개 입력!");
		int total = 0;
		for (int i = 0; i < 5; i++) {
			int buf = scan.nextInt();
			if (buf < 0)
				continue;
			total += buf;
		}
		System.out.println("양수의 합 = " + total);
		scan.close();
	}

}
