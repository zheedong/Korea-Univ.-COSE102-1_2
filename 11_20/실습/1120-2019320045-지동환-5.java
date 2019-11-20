package exercise_1120;

class Pair<T> {
	private T data1;
	private T data2;

	public Pair(T value1, T value2) {
		this.data1 = value1;
		this.data2 = value2;
	}

	public T getFirst() {
		return data1;
	}

	public T getSecond() {
		return data2;
	}
}

public class Exercise_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String> pair = new Pair<String>("Apple", "Tomato");
		System.out.println(pair.getFirst() + ", " + pair.getSecond());

		Pair<Double> db = new Pair<Double>(1.5, 2.3);
		System.out.println(db.getFirst() + ", " + db.getSecond());
	}

}
