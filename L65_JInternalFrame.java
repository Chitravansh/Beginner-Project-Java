import javax.swing.*;
import java.awt.*;

public class L65_JInternalFrame extends JFrame {
    public L65_JInternalFrame(){

        JInternalFrame iframe = new JInternalFrame("MyInternal Frame", true,true,true);
        initFrame(iframe);
        add(iframe);

        setLayout(null);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new L65_JInternalFrame();
    }
    
    private void initFrame(final JInternalFrame iframe) //Create and Set up the content pane
    {
       iframe.setSize(300,200);
       iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
       iframe.setLocation(50,50 );
       iframe.setVisible(true);
       iframe.setLayout(new FlowLayout());
       iframe.add(new JButton("My Button"));
    }
    
}
