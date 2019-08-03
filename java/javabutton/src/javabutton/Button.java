package javabutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class B extends JFrame implements ActionListener{
	Container c;
	JButton b1 = new JButton("RED");
	JButton b2 = new JButton("GREEN");
	butt(){
	 c=this.getContentPane();
	 c.setLayout(null);
	 
	 b1.setBounds(50, 100, 80, 60);
	 b2.setBounds(50, 150, 80, 60);
	 
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 
	 c.add(b1);
	 c.add(b2);
	 
	 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			c.setBackground(Color.red);
		}
		if(e.getSource()==b2) {
			c.setBackground(Color.green);
			
	}	
}
	
	class Button{
		public void main(String[] args) {
		
		butt jf = new butt();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		}
	}

			
			
}


		
		

