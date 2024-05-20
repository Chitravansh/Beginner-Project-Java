import javax.swing.*;
import java.awt.*;
public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true); // makes the window visible to user
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("Test Application");

        ImageIcon icon = new ImageIcon("vector.png");
       // Image icon = Toolkit.getDefaultToolkit().getImage("D:\\vector.png");
        frame.setIconImage(icon.getImage());
       //frame.setIconImage(icon);
       Container c = frame.getContentPane();
       c.setBackground(Color.RED);
       frame.setResizable(false);

    }
    
}
