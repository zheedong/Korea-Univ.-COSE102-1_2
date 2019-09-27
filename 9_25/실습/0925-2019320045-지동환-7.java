package exercise;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);

			if(i != 10)
				System.out.print("+");
			else
				System.out.print("=");
		}

		System.out.println(sum);
	}

}
