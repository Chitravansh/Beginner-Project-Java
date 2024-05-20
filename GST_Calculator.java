
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GST_Calculator extends JFrame implements ActionListener{
    JComboBox gstrate;
    JTextField iGst,eGst,GSTR;
    
    public GST_Calculator() {
        setTitle("GST Calculator");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("D:\\programs\\GUI java\\GST calculator image.jpg");
        setIconImage(icon.getImage());
        setVisible(true);
        Container c = getContentPane();
        c.setLayout(null);

        String rate[] = {"0.25","3","5","12","18","28"};
        

       JLabel label1 = new JLabel ("Amount Including GST :");
       JLabel label2 = new JLabel ("Amount Exculding GST :");
       JLabel label3 = new JLabel ("GST :");
       JLabel label4 = new JLabel ("GST % :");
       JLabel label5 = new JLabel ("Note : PLEASE RESET AFTER EVERY USE");

        label1.setBounds(10,50,160,20);
        label2.setBounds(10,100,160,20); 
        label3.setBounds(10,150,160,20);
        label4.setBounds(10, 200,160,20);
        label5.setBounds(100,400,300,20);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);

        
        iGst = new JTextField();
        iGst.setBounds(200,50,150,30);
        c.add(iGst);

        eGst = new JTextField();
        eGst.setBounds(200,100,150,30) ;
        c.add(eGst);

        GSTR = new JTextField();
        GSTR.setBounds(200,150,150,30) ;
        GSTR.setEditable(false);
        GSTR.setBackground(Color.WHITE);
        c.add(GSTR);

        JButton btn1 = new JButton("Calculate");
        btn1.setBounds(100,300,100,20);
        c.add(btn1);
        btn1.addActionListener(this);

        JButton btn2 = new JButton("Reset");
        btn2.setBounds(250,300,100,20);
        c.add(btn2);
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               iGst.setText("");
               eGst.setText(""); 
               GSTR.setText("");
            }
        });
        

         gstrate = new JComboBox(rate);
         gstrate.setBounds(200,200,150,30);
         c.add(gstrate);

        revalidate();
            
    }

    public static void main(String[] args) {
        new GST_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(!eGst.getText().isEmpty()){
            try {
                Double rate1 = Double.parseDouble((String) gstrate.getSelectedItem());
                Double amount = Double.parseDouble(eGst.getText());
                Double gst = amount * rate1 / 100;
                Double total = amount + gst;
                iGst.setText(String.valueOf(total)); // Set the total amount back to iGst
                GSTR.setText(String.valueOf(gst));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        else if(!iGst.getText().isEmpty()){
            try {
                Double rate1 = Double.parseDouble((String) gstrate.getSelectedItem());
                Double amount = Double.parseDouble(iGst.getText());
               // Double total = amount + gst;
               Double eAmount = amount * 100/(100 +rate1);
               Double gst = eAmount * rate1 / 100;
                eGst.setText(String.valueOf(eAmount)); // Set the total amount back to iGst
                GSTR.setText(String.valueOf(gst));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        else {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
    
