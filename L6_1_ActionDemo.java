import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*By extending JFrame, the MyFrame class inherits all the properties and methods of the JFrame class, 
allowing you to use and customize the functionality provided by JFrame in your MyFrame class. 
You can then add additional functionality specific to MyFrame or override methods inherited from 
JFrame to customize their behavior for your specific needs. */

class Myframe extends JFrame implements ActionListener {

    Container c;
    JButton btn; 

    Myframe (){
        c = this.getContentPane();
        /*The 'this' keyword in the given code is used to 
        refer to the current instance of the MyFrame class. 
        It is used to call the getContentPane() method which is a method of the superclass JFrame. 
        The getContentPane() method is called on the current instance of the MyFrame class,
         which is referenced by the this keyword */
        c.setLayout(null);

        btn =  new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) /*used to over ride the JFrame class
     properties and make MyFrame an abstract method */
    {


        c.setBackground(Color.YELLOW);
} 
}

public class L6_1_ActionDemo {
    public static  void main(String[] args) {
        Myframe f = new Myframe();// Create frame and set its properties
        f.setTitle("Action  Demo"); // Set the title of the window
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

