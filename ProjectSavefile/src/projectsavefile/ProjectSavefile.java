/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsavefile;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class ProjectSavefile{
//JMenuBar menubar = new JMenuBar();
//JMenu file = new JMenu("File");
//JMenu edit = new JMenu("Edit");
//JMenu help = new JMenu("Help");

    
//    ProjectSavefile(){
//        setTitle("Notepad Application");
//        setBounds(100,100,800,400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ImageIcon icon = new ImageIcon(getClass().getResource("notepad-icon-7.png"));
//        setIconImage(icon.getImage());
        
//    }
    public static void main(String[] args) {
       SaveFile savefile = new SaveFile();
       savefile.setVisible(true);
    }
    
}
