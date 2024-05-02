
package com.blackflower.seventhweeklab;

/**
 *
 * @author emirs
 */
public class swaper<T> {
    public void swap(T[] a, int i, int j){
        T temp = a[i];
        
        a[i] = a[j];
        a[j] = temp;
    }
}
