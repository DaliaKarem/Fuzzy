/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.LINE_AXIS;
import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Yehia
 */
public class outputFrame extends JFrame implements ActionListener {

    private static outputFrame singleFrame = null;
    JLabel sequance;
    JLabel TotalHead;
    JButton Button;

    static outputFrame getInstance() {
        if (singleFrame == null) {
            singleFrame = new outputFrame();
        }

        return singleFrame;

    }

    private outputFrame() {
        JPanel sequancePanel = new JPanel();
        JPanel TotalHeadPanel = new JPanel();
        sequancePanel.setBounds(0, 200, 1000, 50);
        TotalHeadPanel.setBounds(200, 200, 1000, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this.getContentPane(), Y_AXIS));
        this.setSize(1000, 500);

        this.setTitle("Output");
        TotalHead = new JLabel();
        TotalHead.setFont(new Font(null, Font.PLAIN, 18));
        sequance = new JLabel();
        sequancePanel.add(sequance);
        TotalHeadPanel.add(TotalHead);
        sequance.setFont(new Font(null, Font.PLAIN, 18));
        Button = new JButton("<Back");
        Button.setFocusable(false);
        Button.setBounds(175, 350, 100, 50);
        Button.addActionListener(this);
        this.add(sequancePanel);
        this.add(TotalHeadPanel);
        this.add(Button);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button) {

            InputFrame mainFrame = InputFrame.getInstance();
            mainFrame.setVisible(true);
            this.setVisible(false);

        }
    }

}
