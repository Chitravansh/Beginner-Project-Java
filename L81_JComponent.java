import java.awt.*;
import javax.swing.*;

public class L81_JComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(10,10,200,200);
    }
    public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            L81_JComponent comp = new L81_JComponent();
            frame.getContentPane().add(comp);

    }
    
}
