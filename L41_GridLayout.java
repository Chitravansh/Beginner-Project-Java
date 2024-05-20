import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class L41_GridLayout extends JFrame 
{

    JButton btn1 = new  JButton("Button 1");
    JButton btn2 = new  JButton("Button 2");
    JButton btn3 = new  JButton("Button 3");
    JButton btn4 = new  JButton("Button 4");
    JButton btn5 = new  JButton("Button 5");


    public L41_GridLayout(){
        setTitle("Flow Layout Example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridLayout g = new GridLayout(2,3); //GridLayout(row,columns,vertical_gap,horizontal_gap)
       // g.setHgap(20); used to set Horizontal gap
       // g.setVgap(20); used to set vertical gap
        c.setLayout(g);
 

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4,0); //if c.add(btn4,0) is used it means button4 is at 0th index or 1st place 
        c.add(btn5,1);
    }

    public static void main(String[] args) {
        new L41_GridLayout();
    }
}