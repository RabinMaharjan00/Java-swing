package Login;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Myframe extends JFrame implements ActionListener 
{
	Container c;
	JTextField tf =new JTextField();
	JComboBox cb;
	Myframe(){
		c = this.getContentPane();
		c.setLayout(null);
		Color[] clr = {Color.yellow,Color.red,Color.green};
		cb = new JComboBox(clr);
		cb.addActionListener(this);
		cb.setBounds(100,200,300,50);
		c.add(cb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String text = tf.getText();
//		String ntext = text.toUpperCase();
//		tf.setText(ntext);
//		
//		
		Color cl = (Color)cb.getSelectedItem();
		c.setBackground(cl);
		
	}
	
}


public class ActionEvent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myframe frame = new Myframe();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,600,500);
	}

}
