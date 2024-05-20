import javax.swing.*;
import java.awt.*;


public class L16_MyRadioButton {

    public static void main(String[] args) {
        JFrame f = new JFrame("My Radio Button");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(100,50,100,20);
        c.add(rb1);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(200,50,100,20);
        c.add(rb2);

        Font font = new Font("arial",Font.BOLD,16);
        rb1.setFont(font);
        rb2.setFont(font);

        ButtonGroup gender = new ButtonGroup();
        gender.add(rb1);
        gender.add(rb2);

        JRadioButton gen = new JRadioButton("General");
        gen.setBounds(100,100,100,20);
        c.add(gen);

        JRadioButton obc = new JRadioButton("OBC");
        obc.setBounds(200,100,100,20);
        c.add(obc);

        JRadioButton sc = new JRadioButton("SC");
        sc.setBounds(300,100,100,20);
        c.add(sc);

        JRadioButton st = new JRadioButton("ST");
        st.setBounds(400,100,100,20);
        c.add(st);

        ButtonGroup caste = new ButtonGroup();
        caste.add(gen);
        caste.add(obc);
        caste.add(sc);
        caste.add(st);

        
        rb1.setSelected(true);//used  to select male by default
        gen.setSelected(true);//used to select general by default

        obc.setEnabled(false); //disable obc from being selected

        f.setVisible(true);

    }
        
}