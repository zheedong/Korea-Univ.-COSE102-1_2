package exercise_4;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("5���� ���� �Է� : ");
		int[] arr = new int[5];
		double total = 0;
		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();
		for (int k : arr)
			total += k;
		System.out.print("��� : " + total / arr.length);
		scan.close();
	}

}
