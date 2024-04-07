import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener {

    JLabel label1,label2,label3,label4,label5;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea ta1,screen;
    JCheckBox terms;
    JLabel msg;
    JButton submit;
    Container c;

    Myframe(){
        setTitle("Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null); // Center the frame when it is displayed on the screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(255, 243, 0));

        label1 = new JLabel("Name");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male = new JRadioButton("Male",true);
        female = new JRadioButton("Female");

        male.setBounds(130,150,100,20);
        female.setBounds(250,150,100,20);
        
        c.add(male);
        c.add(female);
        
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        label4 = new JLabel("DOB");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String date[] = {"1", "2","3", "4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String months[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        String years[] = {"2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995"};  

        day = new JComboBox(date);
        //day.setSelectedItem(date[8]); used to select particular date by its index
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(120,200,50,20);
        month.setBounds(220,200,50,20);
        year.setBounds(320,200,50,20);
        c.add(day);
        c.add(month);
        c.add(year);

        label5 = new JLabel("Address");
        label5.setBounds(20,250,100,20);
        c.add(label5);

        ta1 = new JTextArea();
        ta1.setBounds(130,240,200,50);
        c.add(ta1);

        terms = new JCheckBox("Please accept terms and conditions");
        terms.setBounds(50,350,230,20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setFont(new Font("Serif", Font.BOLD, 16));
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.WHITE);
        submit.setBounds(120,400,100,30);
        c.add(submit);

        screen = new JTextArea();
        screen.setBounds(375,20,300,340);
        c.add(screen);

        msg = new JLabel("");
        msg.setBounds(20,380,300,20);
        c.add(msg);

        submit.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(terms.isSelected()){
            msg.setText("Registrationn Succesfull");

            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if(female.isSelected()){
                gender = "female";
                }
                String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
                String address =  ta1.getText();

                screen.setText("Name :"+name+"\n"+"Mobile :"+mobile+"\n"+"Gender :"+gender+"\n"+"DOB :"+dob+"\n"+"Address :"+address);

            } else {
                    msg.setText("Accept the terms and conditions");
                    screen.setText("");
                }
        }
    }



public class L19_RegistrationForm{
    public static void main(String[] args){
       Myframe f = new Myframe();
    }
}
