package exercise;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char grade = 'F';
		
		System.out.print("���� �Է�(0~100):");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		}
		System.out.println("����: " + grade);
	}

}
