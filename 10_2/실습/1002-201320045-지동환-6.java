package exercise_4;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int biggest = 0;

		System.out.print("수 5개 입력: ");

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = scan.nextInt();

			if (i == 0) {
				biggest = intArr[i];
			} else {
				if (intArr[i] > biggest)
					biggest = intArr[i];
			}

		}

		for (int i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + " ");

		System.out.print("\n가장 큰 수 : " + biggest);
		scan.close();
	}

}
