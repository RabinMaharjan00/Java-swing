package Login;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;



public class Login extends JFrame {
	JLabel l1, l2, l3;
	 JTextField t1;
	 JButton btn1;
	 JPasswordField p1;
	public Login(String s) {
		super(s);
	}
	public void setComponent() {
		  l1 = new JLabel("Login Form");
		  l1.setForeground(Color.black);
		  l1.setFont(new Font("Serif", Font.BOLD, 20));
		  l2 = new JLabel("Enter Username");
		  l3 = new JLabel("Enter Password");
		  t1 = new JTextField();
		  p1 = new JPasswordField();
		  btn1 = new JButton("Login");

		  setLayout(null);
		  l1.setBounds(200, 30, 400, 30);
		  l2.setBounds(80, 70, 200, 30);
		  l3.setBounds(80, 110, 200, 30);
		  t1.setBounds(300, 70, 200, 30);
		  p1.setBounds(300, 110, 200, 30);
		  btn1.setBounds(150, 160, 100, 30);
		  btn1.addActionListener(new Handler());
		  add(l1);
		  add(l2);
		  add(l3);
		  add(t1);
		  add(btn1);
		  add(p1);




	}
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String user = t1.getText();

			char[] Pass = p1.getPassword();
			String Password = new String(Pass);
			if(user.equals("Rabin") && Password.equals("Rabin")) {
				JOptionPane.showMessageDialog(null, "Welcome back "+ user);
			}
			else {
				JOptionPane.showMessageDialog(null, "Check your Username and Password again");

			    }

			}

	}


	public static void main(String[] args) {
		Login jf = new Login("Login Form");
		jf.setComponent();
		jf.setVisible(true);
		jf.setLocation(100,100);
		jf.setSize(600,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
