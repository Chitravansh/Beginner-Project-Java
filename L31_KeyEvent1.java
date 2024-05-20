import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe  extends JFrame implements KeyListener {
    JTextArea ta;
    Container c;
    Myframe(){
        c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10,10,350,350);
        c.add(ta);
        ta.addKeyListener(this);
    }
    @Override
    public void keyPressed(KeyEvent e){
        ta.setText(ta.getText()+"\n"+"Key is Pressed :"+e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e){
        ta.setText(ta.getText()+"\n"+"Key is Released :"+e.getKeyChar()); 
    }
    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Typed : "+e.getKeyChar());
    }
}
/*keyPressed(KeyEvent e): This method is called when a key is pressed. 
It appends the text "Key is Pressed :" followed by the character of the key
 that was pressed to the text area (ta).

keyReleased(KeyEvent e): This method is called when a key is released. 
It appends the text "Key is Released :" followed by the 
character of the key that was released to the text area (ta).

keyTyped(KeyEvent e): This method is called when a key is typed 
(when a key is pressed and then released). 
It appends the text "Key is Typed : " followed by the 
character of the key that was typed to the text area (ta). */




public class L31_KeyEvent1 {
    
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Key Event Demo");
        f.setBounds(100,100,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
