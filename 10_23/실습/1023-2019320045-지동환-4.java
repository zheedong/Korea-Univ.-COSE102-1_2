package exercise_1023;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Book[] book = new Book[2];

		for (int i = 0; i < book.length; i++) {
			System.out.print("����>> ");
			String title = scan.nextLine();

			System.out.print("����>> ");
			String author = scan.nextLine();

			book[i] = new Book(title, author);
		}

		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + ":" + book[i].author + ")");
		}
		
		scan.close();
	}

}
