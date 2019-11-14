package exercise_1113;

public class Television implements RemoteControl {
	boolean onOff = false;
	public void turnOn() {
		onOff = true;
	}
	public void turnOff() {
		onOff = false;
	}
}
