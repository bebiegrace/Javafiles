package notepad2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_S;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
//import sun.util.logging.PlatformLogger;

public class Notepad2 extends JFrame implements ActionListener {

    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu help = new JMenu("Help");

    JMenuItem newfile = new JMenuItem("New");
    JMenuItem openfile = new JMenuItem("Open");
    JMenuItem savefile = new JMenuItem("Save");
    JMenuItem print = new JMenuItem("Print");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem select = new JMenuItem("Select All");

    JMenuItem about = new JMenuItem("About");

    JTextArea textArea = new JTextArea();

    Notepad2() {
        setTitle("Notepad Application");
        setBounds(100, 100, 800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad-icon-7.png"));
        setIconImage(icon.getImage());

        setJMenuBar(menubar);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);

        file.add(newfile);
        file.add(openfile);
        file.add(savefile);
        file.add(print);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(select);

        help.add(about);

        JScrollPane scrollpane = new JScrollPane(textArea);
        add(scrollpane);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollpane.setBorder(BorderFactory.createEmptyBorder());

        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        newfile.addActionListener(this);
        openfile.addActionListener(this);
        savefile.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        select.addActionListener(this);
        about.addActionListener(this);
        
        // shortcut keys
        newfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        openfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        savefile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,KeyEvent.CTRL_DOWN_MASK));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
        select.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,KeyEvent.CTRL_DOWN_MASK));
       
        
        

    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Notepad2().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //create new file
        if (e.getActionCommand().equalsIgnoreCase("New")) {
               textArea.setText(null); 
              
            //open new file
        } else if (e.getActionCommand().equalsIgnoreCase("Open")) {
            
            JFileChooser fileChooser=new JFileChooser();
            FileNameExtensionFilter textFilter= new FileNameExtensionFilter("Only Text Filter.txt", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(textFilter);
            
            int action=fileChooser.showOpenDialog(null);
            if(action!=JFileChooser.APPROVE_OPTION){
                return;
            }else{
                try{
                BufferedReader reader=new BufferedReader (new FileReader(fileChooser.getSelectedFile()));
                    textArea.read(reader, null);
                    
                    
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
            
            //To save file/text
        } else if (e.getActionCommand().equalsIgnoreCase("Save")){
            
            JFileChooser fileChooser=new JFileChooser();
            FileNameExtensionFilter textFilter= new FileNameExtensionFilter("Only Text Filter.txt", "txt");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(textFilter);
            
            int action=fileChooser.showSaveDialog(null);
//            fileChooser.showSaveDialog(null);
            
            if(action!=JFileChooser.APPROVE_OPTION){ //returns yes or no
                return;
            }else{
                String fileName=fileChooser.getSelectedFile().getAbsolutePath().toString();
                if(!fileName.contains(".txt"))
                    fileName=fileName+".txt";
                try{
                    BufferedWriter writer=new BufferedWriter (new FileWriter(fileName));
                    textArea.write(writer);
                    
                    
                }catch(IOException ex){
                    ex.printStackTrace();
                }
           
            }
        } else if (e.getActionCommand().equalsIgnoreCase("Print")){
            
            try{
                textArea.print();
                
            }catch(PrinterException ex) {
                Logger.getLogger(Notepad2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equalsIgnoreCase("Exit")){
            System.exit(0);
        } else if (e.getActionCommand().equalsIgnoreCase("Cut")){
            textArea.cut();
        } else if (e.getActionCommand().equalsIgnoreCase("Copy")){
            textArea.copy();
        } else if (e.getActionCommand().equalsIgnoreCase("Paste")){
            textArea.paste();
        } else if (e.getActionCommand().equalsIgnoreCase("Select All")){
            textArea.selectAll();
        } else if (e.getActionCommand().equalsIgnoreCase("About")){        
            new About().setVisible(true);

        }
    }

}
