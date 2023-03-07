/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Yehia
 */


public class InputFrame extends JFrame implements ActionListener{
    private static InputFrame singleFrame=null;

   
    JTextField requestsTextField;
    JTextField initialHeadTextField;
    JButton Button;
    JComboBox algorithmsComboBox;
    

    private InputFrame() {
        ImageIcon icon = new ImageIcon("D:\\Games\\GUI\\src\\gui\\output-onlinepngtools.png");
        JPanel imagePanel = new JPanel();
        JLabel iconLabel = new JLabel();
        iconLabel.setText("Disk Scheduling");
        iconLabel.setFont(new Font(null, Font.BOLD, 24));
        iconLabel.setHorizontalTextPosition(JLabel.CENTER);
        iconLabel.setVerticalTextPosition(JLabel.BOTTOM);
        iconLabel.setIcon(icon);
        imagePanel.add(iconLabel);
        imagePanel.setBounds(150, 50, 200, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Disk Scheduling");
        this.setSize(500, 500);
        Button = new JButton("Submit");
        Button.setFocusable(false);
        Button.addActionListener(this);
        String[] algorithms = {"FCFS", "SSTF", "SCAN", "C-SCAN", "LOOK", "C-LOOK", "New Algorithm"};
        algorithmsComboBox = new JComboBox(algorithms);
        algorithmsComboBox.setVisible(true);
        JPanel algorithmsPanel = new JPanel();
        JPanel requestsPanel = new JPanel();
        JPanel initialHeadPanel = new JPanel();
        JLabel initialHeadLabel = new JLabel();
        initialHeadLabel.setText("Initial head: ");
        initialHeadPanel.setBounds(70, 237, 200, 50);
        JLabel algorithmsLabel = new JLabel();
        algorithmsLabel.setText("Algorithms: ");
        algorithmsPanel.setBounds(75, 275, 200, 50);
        algorithmsPanel.setVisible(true);
        JLabel requestsLabel = new JLabel();
        requestsLabel.setText("Current requests: ");
        requestsPanel.setBounds(15, 200, 420, 40);
        
        Button.setBounds(175, 350, 100, 50);
        //algorithmsComboBox.setBounds(0, 0, 100,25);

        //comboBox.setBounds(100,75,50,25);
        requestsTextField = new JTextField();
        initialHeadTextField = new JTextField();
        initialHeadPanel.add(initialHeadLabel);
        initialHeadPanel.add(initialHeadTextField);
        requestsPanel.add(requestsLabel);
        
        requestsPanel.add(requestsTextField);
        algorithmsPanel.add(algorithmsLabel);
        algorithmsPanel.add(algorithmsComboBox);

        requestsTextField.setPreferredSize(new Dimension(250, 30));
        requestsTextField.setFont(new Font(null, Font.PLAIN, 14));
        initialHeadTextField.setFont(new Font(null, Font.PLAIN, 14));
        initialHeadTextField.setPreferredSize(new Dimension(100, 30));
        this.add(imagePanel);
        this.add(requestsPanel);
        this.add(initialHeadPanel);
        this.add(algorithmsPanel);
        this.add(Button);
        this.setVisible(true);
    }
    static InputFrame getInstance()
    {
        if (singleFrame == null)
            singleFrame = new InputFrame();
 
        return singleFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Button) {
            int request[] = Utility.toIntArray(requestsTextField.getText());
            int intitialHead = Integer.parseInt(initialHeadTextField.getText());
            int selectedAlgoIndex = this.algorithmsComboBox.getSelectedIndex();
            Utility.selectedAlgo(request, intitialHead, selectedAlgoIndex);
            outputFrame out = outputFrame.getInstance();
            this.setVisible(false);
            out.setVisible(true);
            
             
             
            
        }
    }
    
    
}
