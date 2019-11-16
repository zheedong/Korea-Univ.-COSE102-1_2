package assignment_1113;

public class Turtle extends PetAnimal { // 상속
	public Turtle(String name, String color, String speciality, String sound) { // 생성자
		super(name, color, speciality, sound);
	}
	public void MakeSound() { // 오버라이딩
		System.out.println("소리: 거북이는 울지 않습니다.");
	}
}
