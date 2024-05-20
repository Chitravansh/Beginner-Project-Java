
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class L72_WelcomeScreen extends JFrame {

    
    public L72_WelcomeScreen() {

        displayWelcomeScreen();

       // setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Welcome to java Tutorials");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

    }
    public static void main(String[] args) {
        new L72_WelcomeScreen();
        
    }

    private void displayWelcomeScreen(){
        JWindow w = new JWindow(this);
        w.setSize(600,400);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        


        JPanel panel = new JPanel();
        w.add(panel);
        String imagePath = "D:\\programs\\GUI java\\Image\\uid.jpg";
        JLabel label = new JLabel(new ImageIcon(imagePath));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JProgressBar progress = new JProgressBar(0,100);
        progress.setForeground(Color.orange);
        w.add(BorderLayout.PAGE_END,progress);
        w.revalidate(); // used to show progress
        timer = new Timer(100,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            int x = progress.getValue();
            if (x==100){
                w.dispose();
                L72_WelcomeScreen.this.setVisible(true);
                timer.stop();
            }else{
                progress.setValue(x+2);
            }
            
        }


        });

        timer.start();
            
        }
        
        Timer timer;


    }

