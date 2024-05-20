import javax.swing.*;
import java.awt.event.*;


public class L70_FrameInFrame {
    public static void main(String[] args) {
        new A1();
    }
}


class A1 implements ActionListener{
    JFrame frame1,frame2;
    JLabel label;
    JTextField t1;

    public A1(){
        frame1 = new JFrame("Main Frame");
        frame1.setSize(400,400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);

        JButton b1 = new JButton("Click here");
        label = new JLabel("Message will be displayed here");
        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(label);
        panel.setLocation(300, 400);

        frame1.add(panel);
        b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click here")){
            frame2 = new JFrame("Enter your Message ");
            frame2.setSize(400,200);
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame2.setLocationRelativeTo(frame1);
            frame2.setVisible(true);
    
            t1 = new JTextField();
            t1.setColumns(20);
            JButton b2=new JButton("Submit");
    
            JPanel p2 =new JPanel();
            p2.add(t1);
            p2.add(b2);    
            p2.setLocation(400, 300);   
    
    
            frame2.add(p2);
            b2.addActionListener(this);
        }
        else if(e.getActionCommand().equals("Submit")){
            String message = t1.getText().toString();
            label.setText(message);
            frame2.dispose();   
            frame1.setVisible(true);
        }  
    }
}