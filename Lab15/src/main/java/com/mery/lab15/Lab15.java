/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mery.lab15;

import java.io.File;

/**
 *
 * @author emirs
 */
public class Lab15 {

    public static void main(String[] args) {
        String pathName = "C:\\someFolders";
        recursiveLoop(pathName);
        
    }
    
    
    public static void recursiveLoop(String path){
        File folder = new File(path);
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getPath());
                    recursiveLoop(file.getPath());
                }
            }
        }
    }
}
