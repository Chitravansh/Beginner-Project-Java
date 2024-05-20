import javax.swing.*;
import java.awt.*;


public class L63_ProgressBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ProgressBar Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JProgressBar pb = new JProgressBar(0,100);
        frame.add(pb);

        pb.setStringPainted(true);
        pb.setOrientation(SwingConstants.VERTICAL);

        // to increase the progress
        int i = 0;
        while(i<=100){

            if(i<=0 && i<=50)
            pb.setString("Processing...");

            else if(i>50 && i<70)
            pb.setString("Wait for sometime");

            else if(i>70 && i<=90)
            pb.setString("About to complete...");
            else if(i==100)
            pb.setString("Finished...!");


            pb.setValue(i);

            try{
                Thread.sleep(1000);
            }catch(Exception e){}

            i = i+10;
        }
    }
    
}
