import java.awt.Container;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class L17_MyCheckBox {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container  c = f.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 =  new JCheckBox("Masters");

        c1.setBounds(100,50,200,20);
        c2.setBounds(100,100,200,20);
        c3.setBounds(100,150,200,20);
        c4.setBounds(100,200,200,20);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true); //used to pre-select  the checkboxes
        c1.setEnabled(false);   //disables the first check box
        
        Font font = new Font("arial",Font.ITALIC,20);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);//for setting common properties of multiple components at once


        c4.setEnabled(false); //disables the  last check box  

        f.setVisible(true);
    }
    
}
