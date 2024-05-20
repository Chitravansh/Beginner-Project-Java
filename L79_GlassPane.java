import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.*;



public class L79_GlassPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Glasspane Example ");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        JLabel label = new JLabel("Glasspane Exampple");
        JButton clickMe = new JButton("ClickMe");
        JButton showBtn = new JButton("Show");

        p1.add(label);
        p1.add(clickMe);
        p1.add(showBtn);
        frame.getContentPane().add(p1);
        frame.setVisible(true);  

        clickMe.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label.setVisible(!label.isVisible());
            }
        });

        frame.setGlassPane(new JComponent(){
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });

        final Container glassPane = (Container)frame.getGlassPane();
        glassPane.setLayout(new GridBagLayout());
        JButton hideBtn = new JButton("Hide");

        glassPane.addMouseListener(new MouseAdapter(){});

        showBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                glassPane.setVisible(true);
                glassPane.add(hideBtn);
            }
        });

        hideBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                glassPane.setVisible(false);
            }
        });



    }
}
