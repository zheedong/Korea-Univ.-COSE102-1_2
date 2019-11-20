package exercise_1120;

import java.util.StringTokenizer;

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name=kitae&addr=seoul&age=21";

		StringTokenizer st = new StringTokenizer(query, "&");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

		st = new StringTokenizer(query, "&=");
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
