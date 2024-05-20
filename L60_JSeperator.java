import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class L60_JSeperator extends JFrame{

    public L60_JSeperator() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));// if (1,0) is used then the are arranged infront of each other

        panel.add(new JLabel("My First Label"));
        panel.add(new JSeparator()); //for vertical seperator use JSeparator(SwingConstants.VERTICAL)
                                      //for horizontal seperator use JSeparator() by default it will be Horizontal
        panel.add(new JLabel("My Second Label"));

        add(panel);

        JMenuBar menubar = new JMenuBar();
        add(menubar, BorderLayout.PAGE_START);

        JMenu file = new JMenu("File");
        JMenu  edit = new JMenu("Edit");

        menubar.add(file);
        menubar.add(edit);

        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem find = new JMenuItem("Find");
        JMenuItem findNext = new JMenuItem("FindNext");
        JMenuItem replace = new JMenuItem("Replace");

        edit.add(undo);
        edit.add(redo);

        edit.addSeparator();

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        edit.addSeparator();

        edit.add(find);
        edit.add(findNext);
        edit.add(replace);

    }
    
    public static void main(String[] args) {
        new L60_JSeperator();
    }
}
