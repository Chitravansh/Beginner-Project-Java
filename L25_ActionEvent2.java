import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe extends JFrame implements ActionListener{
    Container c;
    JTextField t1;
    JButton button;    

    public Myframe(){

        setTitle("Action Event");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        c=this.getContentPane();//made the container
        c.setLayout(null);//set the layout of the container to null 

        t1 = new JTextField(); // making of the text field
        c.add(t1); //adding the  button to the container
        t1.setFont(new Font("arial",Font.BOLD,14)); // setting up
        t1.setBounds(100,100,100,30); //
        t1.addActionListener(this);       
    }
    public void actionPerformed(ActionEvent e){
        String str = t1.getText();
        t1.setText(str.toUpperCase());
    }
}

public class L25_ActionEvent2{
    public static void main(String[] args) {
        Myframe f = new Myframe();
    }
}