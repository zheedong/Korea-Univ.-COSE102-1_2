package exercise_1106;

class Shape2 {
	public Shape2 next;

	public Shape2() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape2");
	}
}

class Line extends Shape2 {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape2 {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 extends Shape2 {
	public void draw() {
		System.out.println("Circle");
	}
}


public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape2 start, last, obj;
		start = new Line();
		last = start;

		obj = new Rect();
		last.next = obj;
		last = obj;

		obj = new Line();
		last.next = obj;
		last = obj;

		obj = new Circle2();
		last.next = obj;

		Shape2 p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}

	}

}
