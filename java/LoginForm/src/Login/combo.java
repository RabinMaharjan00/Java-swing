package Login;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo {
	static Container c;
	static JComboBox jc;
	static JButton b1;
	static JLabel msg;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,700,500);
		Container c = frame.getContentPane();
		c.setLayout(null);
		String[] arr = {"A","B","C","D","E"};
		jc.setBounds(100,100,200,30);
		b1 = new JButton("abc");
		b1.setBounds(100,100,200,100);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				blevent(e);
			};
		});
		msg = new JLabel("msg");
		c.add(jc);
		c.add(b1);
		c.add(msg);
	}
		
		static void blevent(ActionEvent e) {
			msg.setText(Integer.toString(jc.getSelectedIndex()));
			
		}
	
		
		
	}

		
	
//		jc.setEditable(true);
////		jc.setSelectedIndex(2);
//		jc.setSelectedItem("C");
//		c.add(jc);
//		

