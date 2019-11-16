package assignment_1113;

public class PetAnimal implements Animal {
	String name;
	String color;
	String speciality;
	String sound;

	PetAnimal(String name, String color, String speciality, String sound) { // ������
		this.name = name;
		this.color = color;
		this.speciality = speciality;
		this.sound = sound;
	}

	public void ShowColor() {
		System.out.println("����: " + color);
	}

	public void ShowSpecial() {
		System.out.println("Ư��: " + speciality);
	}

	public void MakeSound() {
		System.out.println("�Ҹ�: " + sound);
	}

	public void Profile() {
		System.out.println("<" + name + ">");
		this.ShowColor();
		this.ShowSpecial();
		this.MakeSound();
		System.out.println();
	}
}
