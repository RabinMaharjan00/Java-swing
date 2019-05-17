package Login;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;


public class MyRadioButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,700,500);
		Container c = frame.getContentPane();
		JRadioButton b1 = new JRadioButton("male");
		JRadioButton b2 = new JRadioButton("female");
		b1.setBounds(100,50,100,30);
		b2.setBounds(200,50,100,30);
		b1.setSelected(true);
		c.add(b1);
		c.add(b2);
		c.setLayout(null);
		
		
		

	}

}
