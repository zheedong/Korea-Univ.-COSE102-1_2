package assignment;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buf;
		String Kor;
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �̸� �Է�:");
		buf = scan.next();

		if (buf.equals("jan")) {
			Kor = "1��";
		} else if (buf.equals("feb")) {
			Kor = "2��";
		} else if (buf.equals("mar")) {
			Kor = "3��";
		} else {
			Kor = "��Ÿ";
		}
		System.out.print(Kor);
	}

}
