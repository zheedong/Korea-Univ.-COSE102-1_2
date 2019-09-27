package exercise;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100) : ");
		int score = scan.nextInt();
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점: " + grade);

	}

}
