package exercise_1120;

import java.util.Calendar;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println(year + "/" + month + "/" + day);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case Calendar.MONDAY:
			System.out.println("������");
			break;
		case Calendar.TUESDAY:
			System.out.println("ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("������");
			break;
		case Calendar.THURSDAY:
			System.out.println("�����");
			break;
		case Calendar.FRIDAY:
			System.out.println("�ݿ���");
			break;
		}

		int ampm = cal.get(Calendar.AM_PM);
		if (ampm == Calendar.AM)
			System.out.println("����");
		else
			System.out.println("����");

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}

}
