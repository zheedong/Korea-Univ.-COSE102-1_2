package exercise_1204;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream din = null;
		DataOutputStream dos = null;
		try {
			FileOutputStream fos = new FileOutputStream("data.bin");
			dos = new DataOutputStream(new BufferedOutputStream(fos));
			dos.writeDouble(3.14);
			dos.writeInt(100);
			dos.writeUTF("»ç°ú ¹Ù³ª³ª µþ±â Æ÷µµ ±Ö");
			dos.flush();

			FileInputStream fis = new FileInputStream("data.bin");
			din = new DataInputStream(new BufferedInputStream(fis));
			double d = din.readDouble();
			int i = din.readInt();
			String s = din.readUTF();
			System.out.println(d + "\n" + i + "\n" + s);
		} finally {
			if(din != null)
				din.close();
			if(dos != null)
				dos.close();
		}

	}
}
