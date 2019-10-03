package exercise_4;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		try {
			System.out.print(i / j);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 오류 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scan.close();
	}
}