package exercise_4;

public class Exercise_8 {

	enum Weekday {��,ȭ,��,��,��}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"���", "��" , "ü��" , "����" ,"����"};
		for(String s : names)
			System.out.print(s + " ");
		System.out.println();
		
		for(Weekday days : Weekday.values())
			System.out.print(days + "���� ");;

		System.out.println();
	}

}
