package assignment_1204;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_01 {
	public static void DataInput(String Student_ID, String Student_Name) {
		try {
			FileWriter fout = new FileWriter("ȫ�浿.txt");
			fout.write(Student_ID, 0, Student_ID.length());
			fout.write(' ');
			fout.write(Student_Name, 0, Student_Name.length());
			fout.close();
			System.out.println("���Ϸ� �����!");
		} catch (Exception e) {
			System.out.println("Input IOERROR");
		}
	}

	public static void DataPrint() {
		FileReader fin = null;
		try {
			fin = new FileReader("ȫ�浿.txt");
			int c;

			while (true) {
				c = fin.read();
				if (c == -1)
					break;
				System.out.print((char) c);
			}
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
	}

	public static void DataCopy() {
		File src = new File("ȫ�浿.txt");
		File dest = new File("ȫ�浿2.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println("���� ���� �Ϸ�!");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int flow = 0;
		String Student_ID = null;
		String Student_Name = null;

		while (flag) {
			flow = 0;
			System.out.print("�Է�>> ");
			flow = scan.nextInt();
			switch (flow) {
			case 1:
				System.out.print("������ �Է�>> ");
				Student_ID = scan.next();
				Student_Name = scan.next();
				DataInput(Student_ID, Student_Name);
				break;
			case 2:
				System.out.print("������ ���>> ");
				DataPrint();
				break;
			case 3:
				DataCopy();
				break;
			default:
				System.out.println("�����մϴ�..");
				flag = false;
				break;
			}
		}
	}

}
