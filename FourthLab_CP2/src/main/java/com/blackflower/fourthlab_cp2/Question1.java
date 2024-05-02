package com.blackflower.fourthlab_cp2;

/**
 *
 * @author emirs
 */
public class Question1 {
    public static void main(String[] args) {
        
        String[] s = {"1", "6", "1m", "10", "e", "r", "i", "82", "m"};
        
        for (int i = 0; i < s.length; i++) {
            try {
                Integer.parseInt(s[i]);
            } catch (Exception e) {
                System.out.print(s[i]);
            }
        }
        
    }
}
