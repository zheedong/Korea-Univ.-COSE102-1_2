package exercise_4;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average = 0;
		int score = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.print("Á¡¼ö? ");
			score = scan.nextInt();
			if (score < 0)
				break;
			average += score;
			index++;
		}
		average /= index;
		System.out.print("Æò±Õ = " + average);
		scan.close();
	}

}
