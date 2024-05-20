import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L80_JColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Collor Chooser ");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        JButton btn = new JButton("Change Background");
        c.add(btn);

        frame.revalidate();

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Color color = JColorChooser.showDialog(null,"Select a Color" , Color.black);
                c.setBackground(color);
            }
        });

    }
    
}
