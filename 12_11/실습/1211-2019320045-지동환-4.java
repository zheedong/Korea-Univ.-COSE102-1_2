package exercise_1211;

class R implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; --i)
			System.out.print(i + " ");
	}
}

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread r = new Thread(new R());
		r.start();
	}

}
