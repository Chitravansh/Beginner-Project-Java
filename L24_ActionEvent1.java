import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe extends JFrame implements ActionListener{
    Container c;
    JButton button;    

    public Myframe(){

        setTitle("Action Event");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        c=this.getContentPane();//made the container
        c.setLayout(null);//set the layout of the container to null 

        button = new JButton("Click me!"); // making of the button
        c.add(button); //adding the  button to the container
        button.setBounds(100,100,100,30); //
        button.addActionListener(this);       
    }
    public void actionPerformed(ActionEvent e){
        String str = button.getText();
        button.setText(str.toUpperCase());
    }
}

public class L24_ActionEvent1{
    public static void main(String[] args) {
        Myframe f = new Myframe();
    }
}