package Exercise;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("문장을 입력하시오: ");
		String line = input.nextLine();
		System.out.println(line + "\n");
		
		System.out.print("토큰 단위로 입력하시오: ");
		String word = input.next();
		int age = input.nextInt();
		float height = input.nextFloat();
		double weight = input.nextDouble();
		boolean bool = input.nextBoolean();
		
		System.out.println("이름: " + word);
		System.out.println("나이 :" + age);
		System.out.println("키: " + height+ ", 몸무게: " + weight);
		System.out.println(bool);
	}
}
