package exercise_1211;

class T extends Thread {
	String name;
	public T(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 10; i >= 0; --i)
		System.out.print(name + i + " ");	
	}
}

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new T("A");
		t1.start();
		Thread t2 = new T("B");
		t2.start();
	}

}
