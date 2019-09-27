package assignment;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buf;
		String Kor;
		Scanner scan = new Scanner(System.in);

		System.out.print("달의 이름 입력:");
		buf = scan.next();

		if (buf.equals("jan")) {
			Kor = "1월";
		} else if (buf.equals("feb")) {
			Kor = "2월";
		} else if (buf.equals("mar")) {
			Kor = "3월";
		} else {
			Kor = "기타";
		}
		System.out.print(Kor);
	}

}
