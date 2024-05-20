import javax.swing.*;
import java.awt.*;

public class L88_Animation1 extends JFrame {
    L88_Animation1(){
        setSize(800,600);
        setTitle("Graphics Programming");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyAnimation panel = new MyAnimation();
        panel.setBackground(Color.BLACK);
        add(panel);
    }
        
}

public class L88_Animation1
