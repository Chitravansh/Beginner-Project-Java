import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    Container c;
    JLabel label1,label2,result;
    JTextField t1,t2;
    JButton add,sub,mul,div;


    Myframe() {
        setTitle("Simple Calculator");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("First number");
        label1.setBounds(10,20,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);

        label2 = new JLabel("Second number");
        label2.setBounds(10,50,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add = new JButton("+");
        add.setBounds(10,80,70,30);
        c.add(add);
        add.addActionListener(this);
        
        sub = new JButton("-");
        sub.setBounds(100,80,70,30);
        c.add(sub);

        mul =  new JButton("x");
        mul.setBounds(190,80,70,30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(280,80,70,30);
        c.add(div);
        
        result = new JLabel();
        result.setText("Result: ");
        //result.setFont(new Font("Helvetica", Font.BOLD,));
        result.setBounds(10,110,350,30);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        try{
            if(e.getSource()==add){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a+b;
                result.setText("Result :"+c);

            }

            if(e.getSource()==sub){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a-b;
                result.setText("Result :"+c);

            }

            if(e.getSource()==mul){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a*b;
                result.setText("Result :"+c);

            }

            if(e.getSource()==div){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a/b;
                result.setText("Result :"+c);
            }

        }catch(NumberFormatException e1){
            result.setText("Enter the numbers only");
        }
        
        }

    }


public class L14_Calculator {
    public static  void main(String[] args) {
        Myframe frame = new Myframe();
    }
}
