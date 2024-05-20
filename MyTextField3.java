import javax.swing.*;
import java.awt.*;

public class MyTextField3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JTextField t1  = new JTextField(); //used for making text field
        t1.setBounds(100,50,120,30); //used fior setting location and boundary
        c.add(t1); //adding the text field to container
        t1.setText("Hello World"); //assigning a text value to the text field
        Font font =  new Font("Courier New",Font.BOLD,25); //assigning the  font type , style and size to the text field
        t1.setFont(font); //setting the fony properties to the t1
        t1.setForeground(Color.GREEN); //setting the text color
        t1.setBackground(Color.YELLOW);// setting the background color of  the text field

        t1.setEditable(false);//setting the editable to false so nothing could be edited onto the text field
        

        frame.setVisible(true);//used to make window visible on the screen
    }
    
}
