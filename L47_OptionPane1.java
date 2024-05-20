/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L47_OptionPane1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Dialog Example");
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());     
        JButton button = new JButton("Click Me");
        frame.add(button);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
               String str = JOptionPane.showInputDialog("Enter Your Name");
               if(str.length()>0){
                 System.out.println("The name of user is : "+str);
               }
            }
        });
        
        
        
        
    }
}
