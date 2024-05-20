
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;


public class L64_JSlider extends JFrame implements ChangeListener {
    JSlider s;
    JLabel label;

    public L64_JSlider() {

        setLayout(new FlowLayout());

        s = new JSlider();
        add(s);

        s.setMinimum(0);
        s.setMaximum(200);

        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);

        s.addChangeListener(this);

        s.setOrientation(JSlider.VERTICAL);

        label = new JLabel();
        label.setText("The Value of Slider :"+s.getValue());
        add(label);

        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args){
        new L64_JSlider();
    }
    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("The Value Of Slider :"+s.getValue());
    }
}
