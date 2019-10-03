package exercise_4;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "no news is good news";
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'n')
				continue;
			num++;
		}
		System.out.print("문장 내 n의 개수 = " + num);
	}

}
