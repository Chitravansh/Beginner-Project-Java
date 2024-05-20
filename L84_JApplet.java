import javax.swing.*;
import java.awt.event.*;



public class L84_JApplet extends JApplet implements ActionListener{

    JTextField t1;
    JButton b1;

    @SuppressWarnings("removal")
    public void init(){
        setLayout(null);
        t1 = new JTextField("");
        b1 = new JButton("Press me");
        

        t1.setBounds(20,20,100,30);
        b1.setBounds(20,60,100,20);
        add(t1);
        add(b1);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        t1.setText("Boom");

    }

    public static void main(String[] args) {
        new L84_JApplet();
    }


    
}
