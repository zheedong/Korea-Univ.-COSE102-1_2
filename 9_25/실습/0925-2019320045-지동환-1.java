package exercise;

public class Exercise_1 {
	public static void main(String args[]) {
		short a = (short) 0x55ff; //0101 0101 1111 1111
		short b = (short) 0x00ff; //0000 0000 1111 1111

		System.out.printf("%04x\n", (short) (~a));

		byte c = 20; //0x14 (0001 0100)
		byte d = -8; //0xf8 (1111 1000)

		System.out.println(c << 2); 
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", (d >>> 2));
		
		System.out.printf("%04x\n", (a & b));
		System.out.printf("%04x\n", (a | b));
		System.out.printf("%04x\n", (a ^ b));
	}
}
