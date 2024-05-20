import java.awt.*;

import javax.swing.*;


class L43_PanelDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        frame.setTitle("JPanel Example");
        Container c = frame.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 300, 300);
        panel.setBackground(Color.YELLOW);
        panel.setLayout(null);
        c.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 200, 200);
        panel2.setBackground(Color.red);
        panel.add(panel2);
        
        JButton button = new JButton("button");
        panel2.add(button);
    }  
}