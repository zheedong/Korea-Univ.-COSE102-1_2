package exercise_1120;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;

		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);

			System.out.println("гу╟Х : " + sum);
		}
	}

}
