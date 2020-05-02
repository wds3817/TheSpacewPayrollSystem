import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

/**
 * Created by Administrator on 2020/5/1.
 */
public class MainWindow extends Frame {
    public MainWindow(){
        JFrame win = new JFrame("BlueJ: Terminal Window - MT1Proj");
        JMenuBar menubar = new JMenuBar();
        win.setJMenuBar(menubar);
        JMenu menu1 = new JMenu("Options");
        JMenuItem exit = new JMenu("Exit");
        menu1.add(exit);
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.exit(0);
            }
        });
        menubar.add(menu1);
        JTextArea ta = new JTextArea();
        win.add( new JScrollPane(ta));
        win.setSize(800,600);
        win.setLocation(150,150);
        win.setVisible(true);
        win.validate();
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        MainWindow myApp = new MainWindow();
    }
}
