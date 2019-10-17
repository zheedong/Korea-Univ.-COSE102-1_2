package exercise;

import java.util.Scanner;

public class Exercise_03 {

	static void prn(int i, int j) throws Exception {
		if (j == 0) {
			throw new Exception("0으로 나누기 오류 발생");
		} else
			System.out.println(i / j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번쨰 수: ");
		int i = s.nextInt();
		System.out.print("두 번쨰 수: ");
		int j = s.nextInt();

		try {
			prn(i, j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
