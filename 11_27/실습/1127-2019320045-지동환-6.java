package exercise_1127;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");

		System.out.println(dic);
		System.out.println(dic.entrySet());

		System.out.println(dic.keySet());
		System.out.println(dic.values());

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("�ܾ�? ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println("���� �ܾ�");
			else
				System.out.println(kor);
		}
		scanner.close();
	}

}
