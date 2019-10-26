package exercise_1023;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[5];
		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i);
		for (int i = 0; i < c.length; i++)
			System.out.println(c[i].getArea());
	}

}
