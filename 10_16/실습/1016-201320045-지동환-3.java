package exercise;

import java.util.Scanner;

public class Exercise_03 {

	static void prn(int i, int j) throws Exception {
		if (j == 0) {
			throw new Exception("0���� ������ ���� �߻�");
		} else
			System.out.println(i / j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ù ���� ��: ");
		int i = s.nextInt();
		System.out.print("�� ���� ��: ");
		int j = s.nextInt();

		try {
			prn(i, j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
