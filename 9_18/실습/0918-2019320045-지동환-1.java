package Exercise;

public class Exercise_1 {
	public static void main(String[] args) {
		char a = 'A';
		char b = '��';
		char c = '\u0041';
		char d = '\uae00';
		
		System.out.println(a + ", " + b);
		System.out.println(c + "\n" + d);
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("\t") ;
		
		String toolName = "JDK";
		//String toolName = new String("Hello World!");

		
		System.out.println(toolName + " ���");
		
		//���ڿ��� ���ڿ��� ����(+)
		System.out.println(toolName + 12);
		
		//���ڿ��� ������ ����(+)
		System.out.println("(" + 3 + "," + 5 + ")");
	}
}