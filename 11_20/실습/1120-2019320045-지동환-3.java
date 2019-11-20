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
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		}

		int ampm = cal.get(Calendar.AM_PM);
		if (ampm == Calendar.AM)
			System.out.println("오전");
		else
			System.out.println("오후");

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

}
