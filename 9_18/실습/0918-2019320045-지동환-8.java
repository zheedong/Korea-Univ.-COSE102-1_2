package Exercise;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		String line = input.nextLine();
		System.out.println(line + "\n");
		
		System.out.print("��ū ������ �Է��Ͻÿ�: ");
		String word = input.next();
		int age = input.nextInt();
		float height = input.nextFloat();
		double weight = input.nextDouble();
		boolean bool = input.nextBoolean();
		
		System.out.println("�̸�: " + word);
		System.out.println("���� :" + age);
		System.out.println("Ű: " + height+ ", ������: " + weight);
		System.out.println(bool);
	}
}
