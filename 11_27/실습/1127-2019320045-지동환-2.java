package exercise_1127;

class MyArray {
	public static <T> T getLast(T[] a) {
		return a[a.length - 1];
	}
}

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] language = { "C++", "C#", "JAVA" };
		String last = MyArray.getLast(language);
		System.out.println(last);

		Integer[] value = { 1, 3, 2, 5, 4 };
		Integer i = MyArray.getLast(value);
		System.out.println(i);
	}
}
