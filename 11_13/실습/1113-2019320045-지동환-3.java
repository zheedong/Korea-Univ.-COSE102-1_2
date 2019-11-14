package exercise_1113;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.print(p.getWeight());
		System.out.println(", " + p.age + ", " + p.height + ", " + p.name);
		
		Student s = new Student();
		s.set();
		System.out.print(s.getWeight());
		System.out.println(", " + s.age + ", " + s.height + ", " + s.name);
	}

}
