/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.blackflower.cp2__week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emirs
 */
public class CP2__Week6 {

    public static void main(String[] args) { //[M][e]
//        StringBuilder merim = new StringBuilder("Meryemimmmmm");
//        System.out.println(merim.capacity());
//        
//        merim.append("Macun Kaplıcalımmmmm");
//         System.out.println(merim.capacity());
//        
//        String merm2 = "MerM2";
//        
//        for (int i = 0; i < 10000000; i++) {
//            merim.append("m");
//        }
//         System.out.println(merim.capacity());
//        
//        System.out.println(merim);
        
        Pattern pattern = Pattern.compile("[a-z[A-Z]]");
        Matcher matcher = pattern.matcher("F5atih123 Sult8an");
        
        System.out.println(matcher.replaceAll(""));
        System.out.println();
    }
}
