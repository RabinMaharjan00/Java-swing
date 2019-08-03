package Login;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class Registration {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Registration form");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,50,500,500);
		Container c =frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		
		JLabel name = new JLabel("Name");
		JLabel mobile = new JLabel("Mobile");
		JLabel dob = new JLabel("Date of birth");
		JLabel Gender = new JLabel("Gender");
		
		name .setBounds(50,70,70,30);
		mobile.setBounds(50,125,150,20);
		dob.setBounds(50,170,70,20);
		Gender.setBounds(50,200,200,30);
		
		
		JTextField tfn = new JTextField();
		JTextField t1 = new JTextField();
		tfn .setBounds(140, 70, 200, 30);
		t1.setBounds(140, 120, 200, 30);
		
		String [] day_arr = new String[31];
		
		for (int i=1;i<=31;i++) {
			day_arr[i-1]=Integer.toString(i);
			
		}
		
		JComboBox day =new JComboBox(day_arr);
		day.setBounds(240,160,50,30);
		String [] Year_arr =new String[70];
		for(int i=1;i<=70;i++) {
			Year_arr[i-1] =Integer.toString(i+1950);
		}
		
		JComboBox year = new JComboBox(Year_arr);
		year.setBounds(140,160,100,30);
		
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(100,200,100,30);
		
		JRadioButton female =new JRadioButton("Female");
		female.setBounds(300,200,100,30);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(200,300,100,30);
		
		c.add(name);
		c.add(tfn);
		c.add(mobile);
		c.add(t1);
		c.add(dob);
		c.add(day);
		c.add(year);
		c.add(Gender);
		c.add(male);
		c.add(female);
		c.add(submit);
		
		
		
		
		

	}

}
