//import java.awt.Container;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class L42_GridBagLayout extends JFrame {

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");

    public L42_GridBagLayout(){
        setTitle("GridBag Layout Example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        GridBagLayout g = new GridBagLayout();
        c.setLayout(g);

        GridBagConstraints  gbc = new GridBagConstraints(); //used where to display the button
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.weightx = 0.5;//requests for extra available space horizontally
        gbc.gridx=0;
        gbc.gridy=0;
        c.add(btn1,gbc);

       // gbc.weightx=0;//reset  weight request
        gbc.gridx=1;
        gbc.gridy=0;
        c.add(btn2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        c.add(btn3,gbc);

        gbc.gridwidth=3;
        gbc.ipady=40;//the component will occupy three columns
        gbc.gridx=0;
        gbc.gridy=1;
        c.add(btn4,gbc);


        gbc.gridwidth=2;
        gbc.ipady=0;//remove padding around the label
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor= GridBagConstraints.PAGE_END;//aligns the text at bottom of the panel
        gbc.weighty=1;//request for extra vertical space
        c.add(btn5,gbc);

        pack();    

    }

    public  static void main(String[] args) {
        new   L42_GridBagLayout();
    }
    
}
