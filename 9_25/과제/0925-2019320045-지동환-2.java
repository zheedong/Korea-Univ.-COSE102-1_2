package assignment;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("과세 표준 입력(단위 만원):");
		int buf = scan.nextInt();
		int thousand = buf / 1000;
		double tax_percent;
		
		switch (thousand) {
		case 0:
			tax_percent = 0.08;
			break;
		case 1:
		case 2:
		case 3:
			tax_percent = 0.17;
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			tax_percent = 0.26;
			break;
		default:
			tax_percent = 0.35;
			break;
		}
		System.out.print("소득세는 " + buf*tax_percent + "만원입니다.");

	}

}
