import java.awt.Color;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


public class L76_JTextPane extends JFrame{

    public L76_JTextPane(){
    setSize(600,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
    setTitle("Text Pane");

    JTextPane textPane = new  JTextPane();
    textPane.setText("Hello World"); //used to set the complete text styling in a single way

    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setBold(attr,true);
    textPane.setCharacterAttributes(attr, true);

    Document doc = textPane.getStyledDocument();
    
    try {
    doc.insertString(doc.getLength(),"welcome ",attr);
    attr = new SimpleAttributeSet();
    StyleConstants.setItalic(attr,true);
    doc.insertString(doc.getLength(), " to", attr);

    attr = new SimpleAttributeSet();
    StyleConstants.setUnderline(attr,true);
    doc.insertString(doc.getLength(), " Java Swing ", attr);

    attr = new SimpleAttributeSet();
    StyleConstants.setForeground(attr,Color.WHITE);
    StyleConstants.setBackground(attr,Color.RED);
    doc.insertString(doc.getLength(), "Tutorials", attr);
    } catch (Exception e) {}


    getContentPane().add(new JScrollPane(textPane));

    revalidate();
    }
    public static void main(String[] args) {
        new L76_JTextPane();
    }
}
