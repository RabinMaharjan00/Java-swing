/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class myLoginForm extends JFrame implements ActionListener {
    Container c;
    
    JLabel l1 = new JLabel("User Name");
     JLabel l2 = new JLabel("Pasword");
      JButton b1 = new JButton("Login");
      JTextField t1 = new JTextField();
      JPasswordField p1 = new JPasswordField();
      JLabel l3 =new JLabel("");
        
    myLoginForm(){
        c = this.getContentPane();
        c.setLayout(null);
        l1.setBounds(100,100,100,50);
        l2.setBounds(100,150,100,50);
        b1.setBounds(100,200,200,50);
        b1.addActionListener(this);
        t1.setBounds(250,100,200,50);
        p1.setBounds(250,150,200,50);
        l3.setBounds(50,50,200,50);
        
        c.add(l1);
           c.add(l2);
           c.add(b1);
           c.add(t1);
           c.add(p1);
           c.add(l3);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            
            String username = t1.getText();
            String password = p1.getText(); 
            
            if(username.equals("ABC") && password.equals("123")){
                System.out.println(username);
                System.out.println(password);
                l3.setText("Successful");
            }else{
                l3.setText("wrong");
            }
    }
}
}
/**
 *
 * @author Benesha
 */
class Form {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myLoginForm jf = new myLoginForm();
        jf.setVisible(true);
        jf.setBounds(100,100,500,500);
        jf.setTitle("LOGIN");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
    }
    
    
    
    
}
