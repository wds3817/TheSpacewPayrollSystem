import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.OutputStream;
import java.util.Scanner;

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
        JTextField jt1 = new JTextField();
        win.add(BorderLayout.SOUTH, jt1);
        jt1.setBackground(Color.white);
        jt1.setText("Type input and press Enter to send to program");
        jt1.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jt1.setText(null);
                jt1.requestFocus();
            }
        });

        JTextArea ta = new JTextArea(4,25);
        Font x = new Font("Serif", 0, 26);
        ta.setFont(x);
        TextAreaOutputStream taos = new TextAreaOutputStream(ta, "");
        PrintStream ps = new PrintStream(taos);
        InputStream inputStream = new InputStream();
        System.setOut(ps);
        System.setErr(ps);
        jt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(jt1.getText());
            }
        });
        win.add( new JScrollPane(ta));
        win.setSize(800,600);
        win.setLocation(150,150);
        win.setVisible(true);
        win.validate();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MainWindow myApp = new MainWindow();
        System.out.println("Assignment 1 2020 SpaceW payroll estimator");
        System.out.println("Main menu");
        System.out.println("0 - Exit");
        System.out.println("1 - Compute pay for Engineer Scientist");
        System.out.println("2 - Compute pay for Pad Worker");
        System.out.println("3 - Compute pay for Astronaut");
        System.out.println("4 - (Debug tax routine - fortnightly");
        System.out.println("5 - (Debug tax routine - monthly");
        System.out.println("Enter selection 0-5:");
//        Scanner input = new Scanner(System.in);
//        int i = input.nextInt();
//        if (i == 1) {
//            System.out.println("fuck");
//        }
//        if (i == 0) {
//            System.out.println("--- Program ending ---");
//        }
    }
}
