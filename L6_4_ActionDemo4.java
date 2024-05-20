import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L6_4_ActionDemo4 {
    public static Container c;
   public static void main(String[] args) {
    JFrame frame = new JFrame("Action Button");
    frame.setBounds(100,100,700,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    c = frame.getContentPane();
    c.setLayout(null);

    JButton red = new JButton("RED");
    JButton yellow = new JButton("YELOW");
    JButton green = new JButton("GREEN");

    red.setBounds(100, 100, 100, 50);
    yellow.setBounds(250,100,100,50);
    green.setBounds(400,100,100,50);

    c.add(red);
    c.add(yellow);
    c.add(green);

    red.addActionListener(new RedClass());
    yellow.addActionListener(new YellowClass());
    green.addActionListener(new GreenClass());
   }
}

class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        L6_4_ActionDemo4.c.setBackground(Color.red);

    }
}

class YellowClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        L6_4_ActionDemo4.c.setBackground(Color.YELLOW);

    }
}

class GreenClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        L6_4_ActionDemo4.c.setBackground(Color.GREEN);
    }
}