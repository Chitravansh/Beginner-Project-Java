import java.awt.*;

import javax.swing.*;

public class MyFirstFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,1000,500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        // JLabel label = new JLabel("Username");
        // label.setBounds(300,150,200,30);
        // //label.setText("Password"); // used for dynamically chaning the text i.e. replace username with password

        // Font font = new Font("Arial",Font.ITALIC,30);
        // label.setFont(font);

        // c.add(label);


        /*creating image */
        ImageIcon icon = new ImageIcon("vector.png");
        JLabel label = new JLabel("Vector",icon,JLabel.RIGHT);
        label.setBounds(0,100,500,100);
        c.add(label);
     }
    
}
