package exercise_1127;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++)
			list.add(i, (int) (Math.random() * 45 + 1));

		System.out.println(list);

		Collections.sort(list);
		System.out.println("\n------리스트 정렬---------\n");
		System.out.println(list);

		Collections.reverse(list);
		System.out.println("\n------리스트 뒤집기---------\n");
		System.out.println(list);
	}
}
