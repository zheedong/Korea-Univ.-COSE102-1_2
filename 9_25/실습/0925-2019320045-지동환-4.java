package exercise;

import java.util.Scanner;

public class Exercise_4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		char grade;

		System.out.print("���� �Է�(0~100) : ");
		int score = scan.nextInt();
		
		System.out.print("�г� �Է�(0~100) : ");
		int year = scan.nextInt();
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("�հ�!");
			else if (score >= 70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}
		else
			System.out.println("���հ�!");
	}
}
