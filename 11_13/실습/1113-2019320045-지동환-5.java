package exercise_1113;

interface AIInterface {
	void recognizeSpeech();
	void synthesizeSppech();
}

interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

public class Exercise_05 implements PhoneInterface, AIInterface {
	
	public void recognizeSpeech() {
		System.out.println("recognize");
	}
	public void synthesizeSppech() {
		System.out.println("synthesize");
	}
	public void sendCall() {
		System.out.println("send");
	}
	public void receiveCall() {
		System.out.println("receive");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_05 a = new Exercise_05();
		a.printLogo();
		a.recognizeSpeech();
		a.synthesizeSppech();
		a.sendCall();
		a.receiveCall();
	}

}
