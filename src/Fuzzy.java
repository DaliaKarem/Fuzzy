import gui.InputFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.*;
import javax.swing.*;

public class Fuzzy extends JFrame
        implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    public Fuzzy() {
        super("Menu Example");
        JMenuBar jmb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem item;
        file.add(item = new JMenuItem("New"));
        item.addActionListener(this);
        file.add(item = new JMenuItem("Open"));
        item.addActionListener(this);
        file.addSeparator();
        file.add(item = new JMenuItem("Close"));
        item.addActionListener(this);
        jmb.add(file);
        JMenu edit = new JMenu("Edit");
        edit.add(item = new JMenuItem("Copy"));
        item.addActionListener(this);
        Icon tigerIcon = new ImageIcon("SmallTiger.gif");
        edit.add(item = new JMenuItem("Woods", tigerIcon));
        item.setHorizontalTextPosition(JMenuItem.LEFT);
        item.addActionListener(this);
        edit.add(item = new JMenuItem("Woods", tigerIcon));
        item.addActionListener(this);
        jmb.add(edit);
        JMenu choice = new JMenu("Choices");
        JCheckBoxMenuItem check = new JCheckBoxMenuItem("Toggle");
        check.addActionListener(this);
        choice.add(check);
        ButtonGroup rbg = new ButtonGroup();
        JRadioButtonMenuItem rad = new JRadioButtonMenuItem("Choice 1");
        choice.add(rad);
        rbg.add(rad);
        rad.addActionListener(this);
        rad = new JRadioButtonMenuItem("Choice 2");
        choice.add(rad);
        rbg.add(rad);
        rad.addActionListener(this);
        rad = new JRadioButtonMenuItem("Choice 3");
        choice.add(rad);
        rbg.add(rad);
        rad.addActionListener(this);
        jmb.add(choice);
        setJMenuBar(jmb);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
    }
}
//    static void Fuzzification(String name,String []setname,String []type,int[]value,int Crispvalue)
//    {
//        for(int i=0;i<value.length;i++)
//        {
//            if(Crispvalue<value[i])
//            {
//                //while draw line with this value
//            }
//        }
//    }
//    static void Inference()
//    {
//
//    }
//    static void Defuzzification()
//    {
//
//    }
//    static void FuzzyMeanu()
//    {
//        System.out.println("Enter the system's name and a brief descrption\n-----------------------------------------------------------------");
//       String systemBrief=input.nextLine();
//        String menu ="";
//        while(menu!="Close")
//        {
//            System.out.println("Main Menu:\n==============");
//            System.out.println("1-Add Variables\n2-Add fuzzy sets to an existing variable" +
//                    "\n3-Add rules\n4_Run the simulation on crisp values");
//            menu=input.nextLine();
//            switch (menu)
//            {
//                case "1":  addVariable();
//                    break;
//                case "2": fuzzySets();
//                    break;
//                case "3": Rules();
//                    break;
//                case "4": RunCrispValue();
//                    break;
//                default:
//                    System.out.println("this number doesn't exist ,please enter again");
//                    menu=input.nextLine();
//            }
//        }
//    }
//    static void addVariable()
//    {         String var[] = new String[3],
//            status[]=new String[3],range[]=new String[3];
//          String strvar;
//        ArrayList<String> list = new ArrayList<String>();
//
//        System.out.println("Enter the variable’s name, type (IN/OUT) and range ([lower, upper]):\n" +
//                "(Press x to finish)\n---------------------------------------------------------------------------");
//        for (int i=0;i<3;i++)
//        {
//             var[i]=input.next();
//             status[i]=input.next();
//             range[i]=input.nextLine();
//                }
//
//
//    }
//    static void fuzzySets()
//    {  String name;
//        String var[] = new String[3],
//                status[]=new String[3];
//        int range[]=new int[3];
//        System.out.println("Enter the variable’s name:\n----------------------");
//        name=input.nextLine();
//        System.out.println("Enter the fuzzy set name, type (TRI/TRAP) and values: (Press x to finish)\n-----------------------");
//        for (int i=0;i<3;i++)
//        {
//            var[i]=input.next();
//            status[i]=input.next();
//
//        }
//    }



