package exercise;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		char grade;

		System.out.print("점수 입력(0~100) : ");
		int score = scan.nextInt();
		
		System.out.print("학년 입력(0~100) : ");
		int year = scan.nextInt();
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("합격!");
			else if (score >= 70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}
		else
			System.out.println("불합격!");
	}
}
