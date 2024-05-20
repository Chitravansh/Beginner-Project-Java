import java.awt.*;
import  javax.swing.*;
import java.awt.event.*;

public class L18_MyComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lesson 18 MyComboBox");
        // Create a panel to hold everything
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C","D"};

        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);

        JButton button = new JButton("Ok");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel  label = new JLabel("");
        label.setBounds(100,300,100,30);
        c.add(label);

        c1.addItem("E"); //used to  add an item after the component is created
        c1.removeItem("C");//used to remove item  from the list of items in the combo box which is encountered first

        button.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                String item = (String)c1.getSelectedItem(); //used to display the selected value
                //String item = String.valueOf(c1.getSelectedIndex());// used to display index of the value
                label.setText(item);}
        });

        c1.setEditable(true);//to make it such that it could accept anny arbitrary value
        c1.setSelectedItem("B");//to make the default selection

        frame.setVisible(true);
    }
    
}
