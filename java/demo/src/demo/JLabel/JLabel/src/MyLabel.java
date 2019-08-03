package demo;
import static java.awt.Color.*;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;


public class MyLabel {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,500,500,500);
        Container c = frame.getContentPane();
        //Container c1 = frame.getContentPane();
        c.setLayout(null);
        //c1.setLayout(null);
        JLabel l1 = new JLabel("Username:");
        Font f = new Font("Times New Roman",Font.BOLD,30);
        l1.setFont(f);
        l1.setForeground(RED);
        //c1.setBackground(BLACK);
        l1.setBounds(50,50,150,150);
        c.add(l1);
        ImageIcon i = new ImageIcon("TIME.jpg");
        JLabel label = new JLabel(i);
        label.setBounds(100,50,i.getIconWidth(),i.getIconHeight());
        
    }
    
}
