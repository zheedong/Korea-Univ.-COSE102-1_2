package exercise_1204;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		fout = new FileWriter("Test2.txt");
		while (true) {
			System.out.print("ют╥б>> ");
			String line = scan.nextLine();
			if(line.length() == 0)
				break;
			fout.write(line, 0, line.length());
			fout.write("\r\n", 0, 2);
		}
		fout.close();
		scan.close();
	}

}
