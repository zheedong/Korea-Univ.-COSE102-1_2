package Exercise;

import java.util.Scanner;

public class Exercise_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int time = scan.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;

		System.out.print(time + "초 = ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초");

		scan.close();
	}
}
