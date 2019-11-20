package exercise_1120;

class Box<E> {
	private E data;
	public void set(E data) {
		this.data = data;
	}
	public E get() {
		return data;
	}
}

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> b = new Box<String>();
		//Box<String> b = new Box<>();
		b.set("ÀÚ¹Ù");
		String s = b.get();
		System.out.println(s);

		//Box<Integer> b2 = new Box<Integer>();
		Box<Integer> b2 = new Box<>();
		b2.set(10);
		Integer i = b2.get();
		System.out.println(i);

	}

}
