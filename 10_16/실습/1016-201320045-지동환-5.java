package exercise;

public class Exercise_05 {
	String name;
	int radius;

	public Exercise_05() {
		radius = 1;
		name = "";
	}

	public Exercise_05(int r, String n) {
		radius = r;
		name = n;
	}

	public double gettArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_05 pizza;
		pizza = new Exercise_05();
		pizza.name = "피자";
		pizza.radius = 10;
		double area = pizza.gettArea();
		System.out.println(pizza.name + "의 면적:" + area);

		Exercise_05 donut;
		donut = new Exercise_05(2, "도넛");
		area = donut.gettArea();
		System.out.println(donut.name + "의 면적:" + area);
	}

}