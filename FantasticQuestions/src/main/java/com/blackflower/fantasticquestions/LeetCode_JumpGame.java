package com.blackflower.fantasticquestions;

/**
 *
 * @author emirs
 */
public class LeetCode_JumpGame {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(" start: " + result[0] + " end: " + result[1]);
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        int jumpCount = 0;
        int currentMaxReach = 0;
        int nextMaxReach = 0;

        for (int i = 0; i < n - 1; i++) {
            nextMaxReach = Math.max(nextMaxReach, i + nums[i]);

            if (i == currentMaxReach) {
                jumpCount++;
                currentMaxReach = nextMaxReach;

                if (currentMaxReach >= n - 1) {
                    break;
                }
            }
        }

        return jumpCount;
    }

    public int lengthOfLastWord(String s) {
        boolean stop = false;
        int length = 0;
        int i = s.length() - 1;
        for (int j = s.length() - 1; j >= 0; j--) {
            boolean control = (s.charAt(i) == ' ');
            if (control && length != 0) {
                break;
            } else if (!control) {
                length++;
            }

        }
        return length;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int length = nums.length;

        if (length == 0) {
            return result;
        }
        
        int binarySearchIndex = length / 2;
        boolean indexFound = false;

        while (!indexFound && (binarySearchIndex >= 0 && binarySearchIndex < length)) {
            if (nums[binarySearchIndex] < target) {
                binarySearchIndex = (binarySearchIndex + 1 + length) / 2; // Fix binary search logic
            } else if (nums[binarySearchIndex] > target) {
                binarySearchIndex = binarySearchIndex / 2; // Fix binary search logic
            } else {
                result[0] = binarySearchIndex;
                result[1] = binarySearchIndex;
                indexFound = true;
            }
        }

        int right = result[1] + 1;
        int left = result[0] - 1;

        while (right != result[1] && left != result[0]) {
            
            result[0] = left;
            result[1] = right;
            if (right < length && nums[right] == target) {
                right++;
            }
            if (left >= 0 && nums[left] == target) {
                left--;
            }
        }

        return result;
    }
}
