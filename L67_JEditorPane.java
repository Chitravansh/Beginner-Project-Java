import javax.swing.*;
import java.awt.*;

public class L67_JEditorPane extends JFrame {

    JEditorPane pane;
    public L67_JEditorPane() {

       pane = new JEditorPane();
       pane.setContentType("text/plain");
       pane.setText("Lorsem ipsum is an industry standard text which is used to create textual things. Lorsem Ipsuum is industry's most common textual editing thing");

       add(pane,BorderLayout.CENTER);

       setSize(400,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
    }

    public static void main(String[] args){
        new L67_JEditorPane();
    }
     
}
