import javax.swing.*;
import java.awt.*;

public class L5_MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the close button is clicked
        frame.setBounds(100,100,1000,500); //  x, y, width, height
        Container c = frame.getContentPane(); //7 
        c.setLayout(null); 

        JButton btn = new JButton("Click me");
        btn.setBounds(100,30,200,50);
        //setBounds() is used in place of setSize() & setLocation()
        c.add(btn); //Add the button to the container
        Font font = new Font("Arial",Font.PLAIN,20);
        btn.setFont(font); //Used to set font to the button
        btn.setText("mybutton");//assigninng arbitrary text to button
        btn.setForeground(Color.RED); //Setting color of text
        btn.setBackground(Color.YELLOW); //Setting thee Background Color of Button
        
        Cursor cur = new Cursor(Cursor.WAIT_CURSOR); //Creating a hand cursor
        btn.setCursor(cur);

        btn.setEnabled(false); //Disabling the button
        btn.setVisible(false);//Disabling the visibility of the button
        
        ImageIcon icon = new ImageIcon("vector.png");
        JButton btn2 = new JButton(icon);
        btn2.setSize(icon.getIconWidth(),icon.getIconHeight());
        //btn2.setSize(120,30);
        btn2.setLocation(200,200);
        c.add(btn2);


        frame.setVisible(true);
    }
}
    

