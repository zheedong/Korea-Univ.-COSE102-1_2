package exercise;

import java.util.Scanner;

public class Exercise_02 {

	static void prn(int i, int j) throws Exception {
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
			System.out.println("0���� ������ ���� �߻�");
		}
	}

}
