import javax.swing.*;
import java.awt.*;

public class L62_ToolTip extends JFrame{

    public L62_ToolTip(){
        setLayout(null);

        JLabel label = new JLabel("Password");
        label.setBounds(50,100,80,30);
        add(label);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(140,100,80,30);
        add(pwd);

        String str = "<html>"
        +"<div bgcolor='#800080' color='#ffffff'>"
        +"<h2>Enter Your password </h2><br/>"
        +"password should be 8 characters long"
        +"</html>";

        pwd.setToolTipText(str);


        setBounds(400,400,300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new L62_ToolTip();
    }
    
}
