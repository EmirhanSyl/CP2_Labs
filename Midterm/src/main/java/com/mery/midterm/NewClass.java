
package com.mery.midterm;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emirs
 */
public class NewClass extends ArrayIndexOutOfBoundsException{
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("cat");
        a.append("gdfdfhdfhdfhdfssd");
        System.out.println(a.capacity());
        String b = "cat";
        String c = "cat";
        
        System.out.println("test" == "test");
        System.out.println("test" == "te" + "st");
        
        String result = "";
        for (int i = 0; i < b.length(); i++) {
            result += b.charAt(b.length() - (i+1));
        }
        
        araci2();
       
    }
    public static void araci2(){
        int z = 0;
        try {
            araci1(z++);
        } catch (ArrayStoreException a) {
            System.out.println("Exception handled!");
        }finally{
            System.out.println("denendi!");
        }
        
    }
    
    public static void araci1(int a){
        throwExc(1);
        System.out.println("no exception");
    }
    
    public static void throwExc(int a) throws ArrayIndexOutOfBoundsException{
        ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException();
        if (a < 2) {
            throw new NewClass();
        }
    }
}
