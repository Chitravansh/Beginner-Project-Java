
import java.awt.*;

import javax.swing.*;


public class L44_CardLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,500,400);
        frame.setTitle("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        
        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        JButton button1 = new Jbutton("Page 1");
        JButton button2 = new Jbutton("Page 2");
        JButton button3 = new Jbutton("Page 3");
        JButton button4 = new Jbutton("Page 4");
        JButton button5 = new Jbutton("Page 5");

        container.add(button1,"1");//for every button an id is made
        container.add(button2,"2");
        container.add(button3,"3");
        container.add(button4,"4");
        
        cardLayout.next(container);
        cardLayout.previous(container);
        cardLayout.first(container);
        cardLayout.last(container);

        cardLayout.show(container,"3");
    }

    
}
