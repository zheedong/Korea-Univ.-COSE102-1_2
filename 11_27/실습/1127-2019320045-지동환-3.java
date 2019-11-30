package exercise_1127;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름 입력>> ");
			String s = scanner.next();
			a.add(s);
		}
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		int longest = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longest).length() < a.get(i).length())
				longest = i;
		}

		System.out.println("\n가장 긴 이름: " + a.get(longest));

		System.out.print("\n삭제할 번호>> ");
		int i = scanner.nextInt();
		a.remove(i);
		System.out.println(a);
	}
}
