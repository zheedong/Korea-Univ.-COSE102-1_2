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
		System.out.println("\n------����Ʈ ����---------\n");
		System.out.println(list);

		Collections.reverse(list);
		System.out.println("\n------����Ʈ ������---------\n");
		System.out.println(list);
	}
}
