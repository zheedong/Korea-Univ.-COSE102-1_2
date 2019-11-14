package exercise_1113;

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new Television();
		t.turnOn();
		System.out.println("전원ON: " + t.onOff);
		t.turnOff();
		System.out.println("전원ON: " + t.onOff);
	}

}
