package assignment_1113;

import java.util.Scanner;

public class Assignment_01 { // 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetAnimal[] Pet = new PetAnimal[3]; // 객체 배열
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int flow = 0;

		Pet[0] = new Cat("고양이", "Black", "높은 곳 올라가기", "야옹");
		Pet[1] = new Dog("강아지", "Gold", "산책 하기", "멍멍");
		Pet[2] = new Turtle("거북이", "Green", "가만히 누워있기", " ");

		while (flag) {
			System.out.print("번호 선택 (1~3): ");
			flow = scan.nextInt();
			switch (flow) {
			case 1:
				Pet[0].Profile();
				break;
			case 2:
				Pet[1].Profile();
				break;
			case 3:
				Pet[2].Profile();
				break;
			default:
				flag = false;
				break;
			}
		}
		System.out.println("종료합니다.");
	}
}
