package assignment_4;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int class_Num = 0;
		int student_in_class = 0;
		int Korean_score = 0;
		int English_score = 0;
		int score_sum = 0;
		double average = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �� �Է�:");
		class_Num = scan.nextInt();
		System.out.print("�ݺ� �л� �� �Է�:");
		student_in_class = scan.nextInt();

		for (int i = 0; i < class_Num; i++) {
			System.out.println();
			for (int j = 0; j < student_in_class; j++) {
				int small_total = 0;
				double small_ave = 0;
				System.out.print("���� ���� �Է�:");
				Korean_score = scan.nextInt();
				System.out.print("���� ���� �Է�:");
				English_score = scan.nextInt();

				small_total = Korean_score + English_score;
				small_ave = (double)small_total / 2;

				System.out.printf("�� = %d, ��� = %.2f\n", small_total, small_ave);

				score_sum += small_total;
			}
		}

		average = (double)score_sum / ((class_Num * student_in_class) * 2);
		System.out.printf("\n���� = %d, ����� ��� = %.2f\n", score_sum, average);
	}

}
