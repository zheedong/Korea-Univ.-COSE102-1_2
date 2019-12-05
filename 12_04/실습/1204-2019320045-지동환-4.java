package exercise_1204;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("japan.txt");

		BufferedReader in = new BufferedReader(new InputStreamReader(file, "UTF-16"));

		String str;
		while ((str = in.readLine()) != null)
			System.out.println(str);
	}

}
