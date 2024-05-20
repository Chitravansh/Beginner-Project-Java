import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L59_JCheckBoxMenu extends JFrame{

    JMenuItem newFile = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem undo  = new JMenuItem("Undo");
    JMenuItem redo = new JMenuItem("Redo");

    JCheckBoxMenuItem checkMenuItem = new JCheckBoxMenuItem("Word Wrap");
    JTextArea ta = new JTextArea("Lorsem Ipsum is an industry standard based writing used in a scenario of testing ");

    public L59_JCheckBoxMenu(){

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JMenuBar menubar = new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu format = new JMenu("Format");
        //Add menu to menu bar
        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);

        file.add(newFile);
        file.add(open);

        edit.add(undo);
        edit.add(redo);

        format.add(checkMenuItem);
        add(ta,BorderLayout.CENTER);

        checkMenuItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(checkMenuItem.isSelected()){
                    ta.setLineWrap(true);
                    ta.setWrapStyleWord(true);
                } else{
                    ta.setLineWrap(false);
                    ta.setWrapStyleWord(false);
                }
            }
        });



        validate();

    }

    public static void main(String[] args){
        new L59_JCheckBoxMenu();
    }
    
}
