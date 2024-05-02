
package com.blackflower.seventhweeklab;

import java.util.Random;

/**
 *
 * @author emirs
 */
public class Question3 {

    public static void main(String[] args) {
        Random random = new Random();
        String s = "23154687954678455484651";
        boolean isAllLeter = true;
        String randomChars = "";
        for (int i = 0; i < 3; i++) {
            //randomChars = randomChars + s.charAt(random.nextInt(0, s.length()));
            
            if(Character.isLetter(s.charAt(random.nextInt(0, s.length())))){
                isAllLeter = false;
                break;
            }
            
        }
        
        if (isAllLeter) {
            System.out.println("All Number");
        }else{
            System.out.println("Contains other chars!!");
        }
        
        
    }
}
