package exercise;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("����������,īǪġ��,ī���,�Ƹ޸�ī��");
		String i = input.nextLine();
		int price = 0;

		switch(i) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�!");
		}
		if(price !=0) {
			System.out.println(i + ":" + price + "��");
		}
		
	}

}
