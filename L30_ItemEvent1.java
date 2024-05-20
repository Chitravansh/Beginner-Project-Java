import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ItemListener{
    JMenuBar menubar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    JTextArea ta;
    Container c;
    public Myframe(){
        c = getContentPane();
        c.setLayout(null);

        menubar = new JMenuBar();
        mymenu = new JMenu("File");
        menubar.add(mymenu);

        c1 = new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        
        this.setJMenuBar(menubar);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
        c1.addItemListener(this); // used to add working to the c1
    }
    @Override
    public void itemStateChanged(ItemEvent e) {

        if(c1.isSelected()){
            ta.setText("Print is On");
        }

        else{
            ta.setText("Print is Off");
        }

    }
}


public class L30_ItemEvent1 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Menu Item Bar");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
