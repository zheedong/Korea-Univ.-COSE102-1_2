package assignement_1127;

import java.util.Scanner;

public class Assign {
	public static Gen<String, Integer> init() {
		String[] name = { "유재석", "강호동", "이경규" };
		int[] score = { 70, 90, 80 };

		Gen<String, Integer> dataMap = new Gen<String, Integer>();
		for (int i = 0; i < 3; ++i)
			dataMap.setItem(name[i], score[i]);
		
		return dataMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String,Integer> dataMap = init();
		Scanner scan = new Scanner(System.in);
		String name = new String();
		while (true) {
			System.out.print("이름> ");
			name = scan.next();
			if(name.contentEquals("quit"))
				break;
			System.out.println(dataMap.findItem(name));
		}
	}

}
