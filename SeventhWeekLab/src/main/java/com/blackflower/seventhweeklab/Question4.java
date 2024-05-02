
package com.blackflower.seventhweeklab;

/**
 *
 * @author emirs
 */
public class Question4 {
    public static void main(String[] args) {
        swaper<Integer> swapper = new swaper<>();
        
        Integer[] array = {2, 5, 8, 7};
        
        swapper.swap(array, 0, 3);
        
        for (Integer i : array) {
            System.out.println(i);
        }
    }
    
    public <T> void swap(T[] a, int i, int j){
        T temp = a[i];
        
        a[i] = a[j];
        a[j] = temp;
    }
}
