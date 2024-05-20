package layouts;

import java.awt.Container;
import javax.swing.*;

public class NullLayoutExample {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Null Layout Example");
		f.setBounds(300,200,500,300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = f.getContentPane();
		
		c.setLayout(null);
		
		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button4");
		JButton b5 = new JButton("Button5");
		JButton b6 = new JButton("Button6");
		
		b1.setBounds(20,20,80,30);
		b2.setBounds(120,20,80,30);
		b3.setBounds(220,20,80,30);
		b4.setBounds(20,100,80,30);
		b5.setBounds(120,100,80,30);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		
		
	}

}
