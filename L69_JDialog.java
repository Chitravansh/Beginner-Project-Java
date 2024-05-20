import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L69_JDialog implements ActionListener{

    JFrame frame;
    JDialog d;

    public L69_JDialog(){
      frame = new JFrame("JFrame");
      frame.setSize(300,250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

      JPanel panel = new JPanel();
      frame.add(panel);

      JButton b1 = new JButton("Click1");
      b1.addActionListener(this);
      panel.add(b1);

    }

    public static void main(String[] args) {
        new L69_JDialog();
    }


    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getActionCommand().equals("Click1")){
            showFirstDialog();
        }else if(e.getActionCommand().equals("Click2")){
            showSecondDialog();
        }
        
    }

    private void showFirstDialog(){
        JDialog d = new JDialog(frame,"JDialog1");
        d.setSize(200,200);
        d.setVisible(true);
        JPanel panel = new JPanel();
        d.add(panel);

        JButton b = new JButton("Click2");
        b.setSize(30,40);
        panel.add(b);
        b.addActionListener(this);
    }

    private void showSecondDialog(){

        JDialog d1 = new JDialog(frame,"JDialog1"); //JDialog(owner,dialog)
        d1.setSize(200,200);
        d1.setVisible(true);
        d1.add(new JLabel("This is second JDialog"));

    }
    
}
