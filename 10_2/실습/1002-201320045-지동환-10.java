package exercise_4;

public class Exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double average = 0;

		for (double[] r : score) {
			for (double c : r) 
				average += c;
		}
		average /= (score.length * score[0].length);
		System.out.println("전체 평점 평균 : " + average);
	}
}