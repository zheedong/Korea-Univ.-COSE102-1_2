package exercise_4;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'exit'�� �Է� �� ����");
		Scanner scan = new Scanner(System.in);
		String s;
		for (;;) {
			System.out.print(">> ");
			s = scan.next();
			if(s.equals("exit"))
				break;
		}
		System.out.print("�����մϴ�");
		scan.close();
	}

}
