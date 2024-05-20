import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L71_Window extends JFrame implements ActionListener{

    public L71_Window(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel p = new JPanel();
        JButton b = new JButton("click Here");

        p.add(b);
        add(p);
        b.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new L71_Window();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JWindow w = new JWindow(this);
        w.setSize(300,300);
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panel.add(new JLabel("This is a window"));
        w.add(panel);

        w.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    w.dispose();
                }
            }
        });//use to dispose of the window after clicking two times
    }

    
    
}
