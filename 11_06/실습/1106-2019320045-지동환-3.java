package exercise_1106;

class Shape {
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	private int width, height;

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Circle3 extends Shape {
	private int radius;

	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		Rectangle s2 = new Rectangle();
		Circle3 s3 = new Circle3();
		
		s1.draw();
		s2.draw();
		s3.draw();
	}

}
