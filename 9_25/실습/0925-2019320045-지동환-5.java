package exercise;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("에스프레소,카푸치노,카페라떼,아메리카노");
		String i = input.nextLine();
		int price = 0;

		switch(i) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다!");
		}
		if(price !=0) {
			System.out.println(i + ":" + price + "원");
		}
		
	}

}
