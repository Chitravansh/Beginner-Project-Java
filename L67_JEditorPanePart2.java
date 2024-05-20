import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L67_JEditorPanePart2 extends JFrame{

    JEditorPane pane;
    public L67_JEditorPanePart2() {

       pane = new JEditorPane();
       pane.setContentType("text/html");
       pane.setText("<html>"
       +"<h1 color = 'red'>Hello</h1>"
       +"<p>This is my paragraph</p>"
       +"<hr>"
       +"<ol>"
       +"<li>item1</li>"
       +"<li>item2</li>"
       +"<li>item3</li>"
       +"</ol>"
       +"</html>");
    
       add(pane,BorderLayout.CENTER);

       JButton button = new JButton("Show Code");
       button.addActionListener(new ActionListener() {
        @Override
		public void actionPerformed(ActionEvent e) {
            System.out.println(""+pane.getText());
          }
       });

       add(button,BorderLayout.PAGE_END);

       setSize(400,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
    }

    public static void main(String[] args){
        new L67_JEditorPanePart2();
    }
     
}
