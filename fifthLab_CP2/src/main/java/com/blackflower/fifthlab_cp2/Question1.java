package com.blackflower.fifthlab_cp2;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Question1 {
    public static void main(String[] args) {
        String sentence = "Software Engineering";
        
        System.out.println("Length: " + sentence.length());
        System.out.println("Upper Case: " + sentence.toUpperCase());
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Omit Case: " + sentence.replaceAll(" ", ""));
        System.out.println("Add word: " + sentence.concat(" Departmant"));
        System.out.println("Change letters: " + sentence.replaceAll("e", "a"));
        System.out.println("Index of 'n': " + sentence.indexOf("n"));
        System.out.println("Shhorter String: " + sentence.replaceFirst("Software", "Soft"));
        System.out.println(sentence.substring(0, 5));
        
        String nameSurname = "Ahmet Ak";
        System.out.println(nameSurname.substring(0, nameSurname.indexOf(" ")));
        String nameArray[] = nameSurname.split(" ");
        for (String string : nameArray) {
            System.out.println(string);
        }
        
        split(sentence).forEach((word) -> {System.out.println(word);});
        
    }
    
    public static ArrayList<String> split(String s){
        ArrayList<String> splittedResult = new ArrayList<>();
        
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                splittedResult.add(word);
            }
            else{
                word = word + s.charAt(i);
            }
            
        }
        return splittedResult;
    }
}
