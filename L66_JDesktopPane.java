import javax.swing.*;
import java.awt.*;

public class L66_JDesktopPane extends JFrame{
    JDesktopPane dp;
    public L66_JDesktopPane(){

        dp = new JDesktopPane();
        display(dp);
        add(dp,BorderLayout.CENTER);


        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new L66_JDesktopPane();
    }

    private void display(JDesktopPane dp){
        int numFrames = 3, x= 30, y= 30;
        for (int i = 0;i<numFrames;i++){
            JInternalFrame iframe = new JInternalFrame("Internal Frame"+(i+1),true,true,true,true); //used to add properties to the window
            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("I love JAVA"));
            iframe.setVisible(true);

            dp.add(iframe);

            y+=100;
        }
    }
    
}
