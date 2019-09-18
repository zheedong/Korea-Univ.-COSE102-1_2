package Exercise;

public class Exercise_1 {
	public static void main(String[] args) {
		char a = 'A';
		char b = '글';
		char c = '\u0041';
		char d = '\uae00';
		
		System.out.println(a + ", " + b);
		System.out.println(c + "\n" + d);
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("\t") ;
		
		String toolName = "JDK";
		//String toolName = new String("Hello World!");

		
		System.out.println(toolName + " 출시");
		
		//문자열과 문자열의 결합(+)
		System.out.println(toolName + 12);
		
		//문자열과 숫자의 결합(+)
		System.out.println("(" + 3 + "," + 5 + ")");
	}
}