import javax.swing.*;
import java.awt.*;

public class L45_BoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("L45_BoxLayout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("Box Layout Example");
        frame.setTitle("Box Layout Example");
        Container container = frame.getContentPane();

        //BoxLayout boxLayout = new BoxLayout(container,BoxLayout.X_AXIS);
        // BoxLayout boxLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
         BoxLayout boxLayout = new BoxLayout(container,BoxLayout.PAGE_AXIS);

        container.setLayout(boxLayout);

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");

        button1.setAlignmentX(Component.CENTER_ALIGNMENT);//used for the alignment of the button
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        container.add(button1);
        container.add(Box.createRigidArea(new Dimension(0,80)));//used for adding gap between twwo buttons
        container.add(button2);
        container.add(button3);
        container.add(button4);

    }
    
}
