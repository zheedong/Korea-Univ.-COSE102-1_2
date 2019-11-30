package exercise_1127;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		System.out.println(dic);
		System.out.println(dic.entrySet());

		System.out.println(dic.keySet());
		System.out.println(dic.values());

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("단어? ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println("없는 단어");
			else
				System.out.println(kor);
		}
		scanner.close();
	}

}
