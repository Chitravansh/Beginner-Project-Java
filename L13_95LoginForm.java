import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{

    Container  c;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    JButton btn1;


    Myframe (){
        setTitle("LoginForm");
        setVisible(true);
        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c=getContentPane();
        c.setLayout(null);

        label1 = new JLabel ("User Name : ");
        label2 = new JLabel ("Password : ");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20); 
        

        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(130,60,150,30);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(130,100,150,30) ;
        c.add(pass);

        btn1 = new JButton("Login");
        btn1.setBounds(100,150,70,20);
        c.add(btn1);

        btn1.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Username : "+user.getText());
        System.out.println("Password : "+pass.getText());
    }
}

public class L13_95LoginForm {
    public static void main(String[] args) {

        Myframe frame = new Myframe();
        
    }
    
}
