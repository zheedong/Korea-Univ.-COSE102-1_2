package exercise_1204;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = { 7, 33, 3, 4, -1, 18 };
		try {
			FileOutputStream fout = new FileOutputStream("Test3.txt");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (IOException e) {
			System.out.println("저장 불가. 경로 확인.");
			return;
		}
		System.out.println("저장 성공!");

		byte b2[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("Test3.txt");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b2[n] = (byte) c;
				++n;
			}
			for (int i = 0; i < b2.length; ++i)
				System.out.print(b2[i] + " ");
			fin.close();
		} catch (IOException e) {
			System.out.println("파일 읽기 오류. 경로 확인.");
		}
	}

}
