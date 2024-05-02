
package com.blackflower.fantasticquestions;

/**
 *
 * @author emirs
 */
public class LeetCode_RainTrap {
    public static void main(String[] args) {
        int[] height = {0,1,2,0,3,0,1,2,0,0,4,2,1,2,5,0,1,2,0,2};
        System.out.println("Trapped Water: " + trap(height));
    }
    
    public static int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int trappedWater = 0;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}
