package exercise_1023;

public class Exercise_1 {
	int radius;

	public Exercise_1() {
		this.radius = 1;
	}

	public Exercise_1(int r) {
		this.radius = r;
	}

	double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_1 donut = new Exercise_1();
		System.out.println(donut.getArea());

		Exercise_1 pizza = new Exercise_1(10);
		System.out.println(pizza.getArea());
	}

}
