import javax.swing.*;

public class L86_LookAndFeel extends JFrame{

    public L86_LookAndFeel(){
        setSize(350,260);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel label1 = new JLabel("Username");
        JLabel label2 = new JLabel("Password");
        JTextField textField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton clear = new JButton("Clear");
        JButton login = new JButton("Login");
        label1.setBounds(50,50,100,30);
        label2.setBounds(50,100,100,30);
        textField.setBounds(160,50,120,30);
        passwordField.setBounds(160,100,120,30);
        clear.setBounds(80,150,80,30);
        login.setBounds(170,150,80,30);

        add(label1);
        add(label2);
        add(textField);
        add(passwordField);
        add(clear);
        add(login);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception{

        String str = "javax.swing.platf.nimbus.NimbusLookAndFeel";
    try {
        UIManager.setLookAndFeel(str);
    }catch (ClassNotFoundException e){
        System.out.println("Class not found");
    }
        new L86_LookAndFeel();
    }
    
}
