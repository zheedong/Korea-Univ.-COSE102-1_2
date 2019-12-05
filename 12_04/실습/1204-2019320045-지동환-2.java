package exercise_1204;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			fin = new FileInputStream("Test2.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;
			System.out.println("인코딩 문자 집합: " + in.getEncoding());
			while ((c = in.read()) != -1)
				System.out.print((char) c);
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
