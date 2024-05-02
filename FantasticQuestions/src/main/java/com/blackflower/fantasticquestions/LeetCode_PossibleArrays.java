
package com.blackflower.fantasticquestions;

/**
 *
 * @author emirs
 */
public class LeetCode_PossibleArrays {

    public static void main(String[] args) {
        
    }
    
    public int numOfArrays(int n, int m, int k) {
        int possibilities = 0;
        
        if (m < k) {
            return 0;
        }else if(n == k){
            return calculateCombination(m, n);
        }else if(m == k){
            
        }
        
        
        
        return possibilities;
    }
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int calculateCombination(int m, int n) {
        int numerator = factorial(m);
        int denominator = factorial(n) * factorial(m - n);

        return numerator / denominator;
    }
}
