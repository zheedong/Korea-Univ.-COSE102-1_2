package exercise_4;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'exit'을 입력 시 종료");
		Scanner scan = new Scanner(System.in);
		String s;
		for (;;) {
			System.out.print(">> ");
			s = scan.next();
			if(s.equals("exit"))
				break;
		}
		System.out.print("종료합니다");
		scan.close();
	}

}
