import javax.swing.*;

import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm2 extends JFrame implements ActionListener {
	Container c;
	JLabel l1 = new JLabel("Username");
	JLabel l2 = new JLabel("Password");
	JTextField tf = new JTextField(" ");
	JPasswordField pf = new JPasswordField();
	JButton btn = new JButton("Login");
	
	LoginForm2(){
		c= this.getContentPane();
		c.setLayout(null);
		btn.addActionListener(this);
		c.add(l1);
		c.add(l2);
		c.add(tf);
		c.add(pf);
		c.add(btn);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn) {
			String Username =tf.getText();
			char[] Pass = pf.getPassword();
			String Password = new String(Pass);
			if (Username.equals("ABC")&& Password.equals("123")) {
				c.add(l1);
			}
			
	
			
			
		}
		JLabel l1 = new JLabel("Successfull");
		JLabel l2 = new JLabel("Wrong username and password ");
		
		
	}
	
	public stat
	
	

	
}
