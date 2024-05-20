import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L68_ToggleButton extends JFrame implements ActionListener{

    private JToggleButton toggle;
    private Color defaultColor;
    Container c;

    public L68_ToggleButton(){

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        c = getContentPane();
        c.setLayout(null);
        defaultColor = c.getBackground();
        
        toggle = new JToggleButton("OFF");
        toggle.setBounds(200,200,100,50);
        c.add(toggle);

        toggle.addActionListener(this);
    }

    public static void main(String[] args) {
        new L68_ToggleButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(toggle.isSelected()){
            c.setBackground(Color.YELLOW);
            toggle.setText("ON");
        }else{
            c.setBackground(defaultColor);
            toggle.setText("OFF");
        }

    }
    
}
