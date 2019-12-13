package exercise_1211;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("ContnetPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X 누르면 종료 됨
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);

		//c.setLayout(new FlowLayout());
		/*
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		*/
		
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);

		setSize(300, 200);
		setVisible(true);
	}
}

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}