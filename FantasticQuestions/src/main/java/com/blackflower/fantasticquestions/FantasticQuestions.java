package com.blackflower.fantasticquestions;

import javax.swing.JFrame;

/**
 *
 * @author emirs
 */
public class FantasticQuestions {

    public static void main(String[] args) {
        JFrame frameName = new JFrame();
        frameName.setVisible(true);
        Question1 panel = new Question1();
        Question2 panel2 = new Question2();
        Slider panel3 = new Slider();
        frameName.add(panel3);
    }
}
