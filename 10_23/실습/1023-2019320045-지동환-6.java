package exercise_1023;

import java.util.Scanner;

public class Exercise_6 {
	private static double rate;
	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scan.nextDouble();
		Exercise_6.setRate(rate);

		System.out.print("ȯ��(1�޷�)>> ");
		int won = scan.nextInt();
		System.out.println("$" + Exercise_6.toDollar(won));

		System.out.print("�޷� �Է�>> ");
		int dol = scan.nextInt();
		System.out.println(Exercise_6.toKWR(dol) + "��");
		scan.close();
	}

}
