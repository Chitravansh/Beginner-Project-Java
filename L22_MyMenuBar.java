import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class L22_MyMenuBar{
    public static void main(String[] args){
        JFrame f = new JFrame("Menubar Example");
        f.setSize(600,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        menubar.add(file);

        JMenu edit = new JMenu("Edit");
        menubar.add(edit);

        JMenu savetyp = new JMenu("Save Type");
        file.add(savetyp); //added a submenu to the menu

        JMenuItem  new1 = new JMenuItem("New");
        JMenuItem  open = new JMenuItem("Open");
        JMenuItem  save = new JMenuItem("Save");
       // JMenuItem  save = new JMenuItem("Save As");
        JMenuItem  saveas = new JMenuItem("Save As");

        JMenuItem  undo = new JMenuItem("Undo");
        JMenuItem  redo = new JMenuItem("Redo");

        file.add(new1); // added a menuitem to the menu
        file.add(open);
        
        edit.add(undo); 
        edit.add(redo);

        savetyp.add(save); //added a menuitem to the submenu
        savetyp.add(saveas);


        f.setJMenuBar(menubar);

       f.setVisible(true);
       
    }
}