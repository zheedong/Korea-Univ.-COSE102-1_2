package exercise;

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int buf = 0;
		int count = 0;
		double ave = 0;

		System.out.print("정수 입력(종료:-1) : ");
		while (true) {
			buf = scan.nextInt();

			if(buf == -1)
				break;

			ave += buf;
			count++;
		}
		ave /= count;
		if (count == 0) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			System.out.println("정수의 개수 = " + count + "개");
			System.out.println("평균 = " + ave);
		}
	}

}