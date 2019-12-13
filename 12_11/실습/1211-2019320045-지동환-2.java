package exercise_1211;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercise_02 extends JFrame {
	public Exercise_02() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X ������ ���� ��

		Container c = getContentPane();
		//c.setLayout(new GridLayout(0, 4));
		c.setLayout(new GridLayout(4, 2, 0, 5));
		
		/*	
		c.add(new JLabel("�̸�"));
		c.add(new JLabel("�й�"));
		c.add(new JLabel("�а�"));
		c.add(new JLabel("����"));
		*/

		c.add(new JLabel("�̸�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("����", JLabel.CENTER));
		c.add(new JTextField(""));


		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise_02();
	}

}
