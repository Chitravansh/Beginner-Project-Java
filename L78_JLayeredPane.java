import java.awt.Color;

import javax.swing.*;


public class L78_JLayeredPane extends JFrame {


    public L78_JLayeredPane(){
        JLayeredPane pane =  this.getLayeredPane();

        JButton  bRed  = new JButton("RED");
        bRed.setBackground(Color.red);
        bRed.setBounds(20,20 ,50 ,50 );

        JButton  bGreen  = new JButton("GREEN");
        bRed.setBackground(Color.green);
        bRed.setBounds(80,40 ,50 ,50 );

        JButton  bBlue  = new JButton("BLUE");
        bRed.setBackground(Color.blue);
        bRed.setBounds(150,60 ,50 ,50 );

        pane.add(bRed,new Integer(10));
        pane.add(bGreen,new Integer(40));
        pane.add(bBlue,new Integer(30));

    }

    public static void main(String[] args) {
        L78_JLayeredPane frame =  new L78_JLayeredPane();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
