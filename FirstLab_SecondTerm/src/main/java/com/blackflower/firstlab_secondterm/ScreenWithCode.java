package com.blackflower.firstlab_secondterm;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emirs
 */
public class ScreenWithCode {
    
    static private JFrame f = new JFrame();
    static private JLabel label = new JLabel();
    static private JTextField field = new JTextField("");
    static private JButton button = new JButton();
        
    public static void main(String[] args) {
        label.setText("name: ");
        field.setSize(100, 50);
        
        button.setSize(60, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {            }
        });
        
        
        f.add(label);
        f.add(field);
        f.add(button);
        
        f.setSize(300, 300);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    private static void buttonActionPerformed(ActionEvent event){
        
    }
}
