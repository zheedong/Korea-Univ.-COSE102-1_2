package exercise;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ���� ��: ");
		int i = s.nextInt();
		
		System.out.print("�� ���� ��: ");
		int j = s.nextInt();
		
		try {
			System.out.println(i/j);
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�");
		}
	}

}
