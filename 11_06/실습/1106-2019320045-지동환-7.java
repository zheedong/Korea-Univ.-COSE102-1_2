package exercise_1106;

abstract class Shape7 {
	private int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}

class Rectangle7 extends Shape7{
	private int width, height;
	public void draw() {
		System.out.println("사각형 그리기");
	}
}

class Circle7 extends Shape7{
	private int radius;
	public void draw() {
		System.out.println("원 그리기");
	}
}

public class Exercise_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle7 obj1 = new Rectangle7();
		Circle7 obj2 = new Circle7();
		obj1.draw();
		obj2.draw();
	}

}
