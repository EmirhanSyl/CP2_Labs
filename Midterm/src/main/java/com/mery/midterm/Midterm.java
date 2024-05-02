
package com.mery.midterm;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emirs
 */
public class Midterm {

    static public int a;
    public static void main(String[] args) {
        gen<Number> _gen = new gen();
        _gen.aaaaa(8);
        System.out.println(gen.a3);
        
        //gen<int> prim = new gen<>();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<? extends Number> list2 = new ArrayList<>();
        Number i = 5;
        //list2.add(i);
        
        int a = 5;
        Integer b = a;
        //Integer.SIZE;
        b.compareTo(4);
        b.toString();
        
        //ArrayList<Object> listObj = list;
        Map<String, Integer> mappp;
        mappp = new HashMap();
        list.add(1);
        list.add(2);
        list.add(3);
        
            int tot = 0;
        for (int object : list) {
            tot += object;
        }
        //int a = Midterm.add(6, 4);
        //boolean b = add(true, false);
        
        
        
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Integer> numbersInt = new ArrayList<>();
        
        numbers.add(5);
        numbers.add(7.3);
        numbers.add(7.3f);
        numbers.add(7L);
        smth(numbers);
        
        System.out.println("---------------");
        
        numbersInt.add(0);
        numbersInt.add(1);
        smth(numbersInt);
        
        float z = 5.4f;
        
        System.out.printf(Locale.JAPAN,"dfjşldfhkşldfkl %%%f", z);
        System.out.printf(Locale.JAPAN,"dfjşldfhkşldfkl%,d%n", 1200000000);
        
        
        DecimalFormat df = new DecimalFormat("₺,000.000");
        String result = df.format(123456.7809);
        System.out.println(result);
        
        String text = "Fat1ih Sıştdgskg";
        Pattern pattern = Pattern.compile("Fat");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.group());
    }
    
    public static <T>T add(T type, T type2){
        T t = null;
        return t;
    }
    
    public static void smth(ArrayList<? extends Number> numbers){
        for (Number number : numbers) {
            System.out.println(number + " - " + number.getClass());
        }
        
    }
    
    public static <T>void wildCard(gen<? extends Number> gennn){
        
    }
}
