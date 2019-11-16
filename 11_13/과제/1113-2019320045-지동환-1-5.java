package assignment_1113;

public class PetAnimal implements Animal {
	String name;
	String color;
	String speciality;
	String sound;

	PetAnimal(String name, String color, String speciality, String sound) { // 생성자
		this.name = name;
		this.color = color;
		this.speciality = speciality;
		this.sound = sound;
	}

	public void ShowColor() {
		System.out.println("색상: " + color);
	}

	public void ShowSpecial() {
		System.out.println("특기: " + speciality);
	}

	public void MakeSound() {
		System.out.println("소리: " + sound);
	}

	public void Profile() {
		System.out.println("<" + name + ">");
		this.ShowColor();
		this.ShowSpecial();
		this.MakeSound();
		System.out.println();
	}
}
