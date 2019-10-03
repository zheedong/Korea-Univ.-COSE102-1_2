package exercise_4;

public class Exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		for (int[] r : array) {
			for(int c : r)
				System.out.print(c + " ");
			System.out.println();
		}
	}

}
