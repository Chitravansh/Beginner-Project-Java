import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class Myframe extends JFrame implements ActionListener{
    JMenuBar menubar;
    JMenu file,edit;
    JTextArea ta;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;

    Container c;
    public Myframe(){
        setTitle("Action Event");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        c=getContentPane();//made the container
        c.setLayout(null);
        
        menubar = new JMenuBar();
      

        file = new JMenu("File");
        edit = new JMenu("Edit");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select all");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);


        menubar.add(file);
        menubar.add(edit);

        file.add(i1);
        file.add(i2);
        file.add(i3);
        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);
        
        this.setJMenuBar(menubar); // to add this to frame

        ta = new JTextArea();
        ta.setBounds(10,10,370,370);
        c.add(ta);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1){
        ta.setText("New File...");
    }

    if(e.getSource()==i2){
        ta.setText("OpenFile...");
    }

    if(e.getSource()==i3){
        ta.setText("Save File...");
    }

    if(e.getSource()==i4){
        ta.cut();
    }

    if(e.getSource()==i5){
        ta.copy();
    }

    if(e.getSource()==i6){
        ta.paste();
    }

    if(e.getSource()==i7){
        ta.selectAll();
    }

      }
    }

public class L26_ActionEvent3 {
    public static void main(String[] args) {
        Myframe frame = new Myframe();

    }
    
}
