
package com.mery.cp2_weekk_13;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.


/**
 *
 * @author emirs
 */
public class Q2 {
    public static void main(String[] args) {
        
        Path path = Paths.get("C:\\users\\Lenovo\\Desktop\\deneme.txt");
        
        int nameCount = path.getNameCount();
        Path root = path.getRoot();
        
        System.out.println("Root: " + root);
        System.out.println("Folders:");
        for (int i = 0; i < nameCount; i++) {
            
            Path folder = path.getRoot() + path.getName(i);
            try {
                System.out.println(folder + " is " + folder.toRealPath());
            } catch (IOException ex) {
                Logger.getLogger(Q2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
