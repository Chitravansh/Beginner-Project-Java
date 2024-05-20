import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class L15_JTextArea { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing Text Area");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c  = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 100, 400, 200);
        c.add(textArea);

        textArea.setText("This is text area ");
        textArea.setFont(new Font("arial",Font.BOLD,15));
        textArea.setLineWrap(true);

        frame.setVisible(true);

        
    }
    
}
