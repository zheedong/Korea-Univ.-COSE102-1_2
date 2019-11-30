package exercise_1127;

class Pair<F, T> {
	private F data1;
	private T data2;

	public Pair(F field, T value) {
		this.data1 = field;
		this.data2 = value;
	}

	public F getFirst() {
		return data1;
	}

	public T getSecond() {
		return data2;
	}
}

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new Pair<String, Integer>("학번:", 2019320045);
		System.out.println(p1.getFirst() + " " + p1.getSecond());

		Pair<String, String> p2 = new Pair<String, String>("이름:", "지동환");
		System.out.println(p2.getFirst() + " " + p2.getSecond());
	}

}