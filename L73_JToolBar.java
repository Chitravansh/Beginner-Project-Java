import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class L73_JToolBar  extends JFrame implements ActionListener{

    JToolBar toolBar = new JToolBar();
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JTextField textField = new JTextField();
   // @SuppressWarnings("rawtypes")
    JComboBox combo = new JComboBox(new String[]{"Item1","Item2","Item3","Item4"});
    JLabel label = new JLabel();


    public L73_JToolBar(){
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        toolBar.add(combo);
        toolBar.add(textField);
        toolBar.add(button1);
        toolBar.addSeparator();
        toolBar.add(button2);

        toolBar.setFloatable(false);

        combo.addActionListener(this);
        textField.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);

        add(BorderLayout.NORTH,toolBar);
        add(label);
        revalidate();//5:37



    }

    public static void main(String[] args) {
        new L73_JToolBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
               label.setText("Button 1 clicked!");
        }

        else if(e.getSource()==button2){
            label.setText("Button 2 clicked!");
        }

        else if(e.getSource()==combo){
            label.setText(combo.getSelectedItem()+" Selected");
        }

        else if(e.getSource()==textField){
            label.setText("Enter is pressed in textField \n\n");
            
        }
    }

    
}
