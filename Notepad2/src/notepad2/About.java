
package notepad2;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class About extends JFrame {
    About(){
       
        setBounds(100,100,500,400);
         setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad-icon-7.png"));
        setIconImage(icon.getImage());
        
        setLayout(null);
        
        JLabel iconLabel=new JLabel(new ImageIcon(getClass().getResource("notepad-icon-7.png")));
        iconLabel.setBounds(100,50,80,80);
        add(iconLabel);
        
        JLabel textLabel=new JLabel("<html> Bebie Grace Balbuena!  Welcome to notepad!</html>");
        textLabel.setBounds(100,50,350,300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        add(textLabel);
    
    }
     public static void main(String[] args) {
     new About().setVisible(true);
      
   }
}