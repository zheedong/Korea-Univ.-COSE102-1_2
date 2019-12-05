package exercise_1204;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\Web\\Wallpaper\\Theme1\\img1.jpg"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\copyimg.jpg"); // 복사 파일 경로명

		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0,n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
