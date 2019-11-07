package exercise_1106;

class Person {
	String name;
	String id;

	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;

	public Student(String name) {
		super(name);
	}
}

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s = new Student("ȫ�浿");

		p = s;

		System.out.println(s.name);

		// p.grade = "A"; //ERROR
		// p.department = "Com"; //ERROR

		s.grade = "A";
		s.department = "Com";

		Person p2 = new Student("ȫ�浿");
		Student s2;

		s2 = (Student) p2;

		s.grade = "A";
		System.out.println(s2.name + ", " + s2.grade);
		//System.out.println(p2.name + ", " + p2.grade); //ERROR
	}

}
