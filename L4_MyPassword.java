import javax.swing.*;
import java.awt.*;
public class L4_MyPassword {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //used to  create the window of our application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //used to  close the window when we click on X button
        frame.setBounds(100,100,1000,500); //used to  set the size and position of the window
        Container c = frame.getContentPane(); //used to  get the content pane of the JFrame
        c.setLayout(null); // Set layout manager to null

        JPasswordField pass = new JPasswordField(); //used to  create a password field
        pass.setBounds(100,50,120,30);  //used  to set the position and size of password field
        c.add(pass); // used to create 
        
        pass.setText("123456789");//used to assign the default text 
        pass.setFont(new Font("Arial",Font.PLAIN,30));//used to set the font properties of password's font
        pass.setEchoChar('*');//used to set arbitrary character from default password dot
        pass.setEchoChar((char)0);//used to make visible the characters of password 
        
        frame.setVisible(true); //used to make the window visible on the screen
        
    }
    
}
