package exercise;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);

		System.out.print("너비 입력:");
		rect.width = scanner.nextInt();
		System.out.print("높이 입력:");
		rect.height = scanner.nextInt();

		System.out.println("사각형의 면적:" + rect.getArea());
		scanner.close();
	}

}
