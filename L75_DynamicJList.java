import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class L75_DynamicJList extends JFrame{

    JTextField textField = new JTextField(15);
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Update");
    JButton b3 = new JButton("Delete");
    int updateIndex=0;

    public L75_DynamicJList(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(1,2));

        JList list = new JList();
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JScrollPane(list));

        //Defa

        DefaultListModel model = new DefaultListModel();
        model.addElement("HighSchool");
        model.addElement("Inter");
        model.addElement("BCA");
        list.setModel(model);

        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.add(textField); //added text field
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
    revalidate();  

    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(!textField.getText().toString().isEmpty()){
            // if text field is not empty it will get that text and convert to string
                String item = textField.getText().toString();
                model.addElement(item);
                textField.setText(null);


            }
        }
    });

    list.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            if(e.getClickCount()==2){
                updateIndex = list.getSelectedIndex();
                textField.setText((String)model.get(updateIndex));
            }
        }
    });

    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            if(!textField.getText().toString().isEmpty()){
                String item = textField.getText().toString();
                model.setElementAt(item, updateIndex);
                textField.setText(null);
            }

        }
    });

    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            model.remove(list.getSelectedIndex());
        }
        
    });


    }
    public static void main(String[] args) {
        new L75_DynamicJList();
    }
}
