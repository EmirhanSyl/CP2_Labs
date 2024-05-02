package com.blackflower.firstlab_secondterm;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emirs
 */
public class ToggleButton {
    
    static private JFrame frame = new JFrame();
    static private JLabel label = new JLabel("Press button for change visibility");
    static private JToggleButton tButton = new JToggleButton("PRESS");
    
    
    public static void main(String[] args) {
        frame.add(label);
        frame.add(tButton);
        
        tButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                label.setVisible(!label.isVisible());
            }
        });
        
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
