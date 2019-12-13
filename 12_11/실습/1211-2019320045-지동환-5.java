package exercise_1211;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer extends Thread {
	private JLabel I;

	public Timer(JLabel I) {
		this.I = I;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			I.setText(Integer.toString(n));
			++n;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Exercise_05 extends JFrame {
	public Exercise_05() {
		setTitle("타이머 스레드");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel I = new JLabel();
		I.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(I);

		Timer th = new Timer(I);
		th.start();

		setSize(300, 170);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise_05();
	}

}
