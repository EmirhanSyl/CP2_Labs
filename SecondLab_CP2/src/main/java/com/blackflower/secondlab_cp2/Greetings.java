package com.blackflower.secondlab_cp2;

/**
 *
 * @author emirs
 */
public class Greetings {
    String lang;
    String message;
    
    public Greetings(String lang, String message){
        this.message = message;
        this.lang = lang;
    }

    @Override
    public String toString() {
        return lang;
    }
    
    
}
