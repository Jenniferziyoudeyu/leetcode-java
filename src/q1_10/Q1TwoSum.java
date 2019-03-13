package q1_10;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */

import java.util.Arrays;
import java.util.*;

public class Q1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];

    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public int[] q1twoSum(int[] array, int target) {
        int i,j;
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

//    public int[] q1twoSum3(int[] array, int target) {
//        Arrays.sort(array);
//        int left = 0, right = array.length - 1;
//        while (left < right) {
//            if (array[left] + array[right] == target) return new int[] {left,right};
//            else if (array[left] + array[right] > target) right--;
//            else left++;
//        }
//        return new int[2];
//
//    }
}

/*
test:
        int[] array = {1,2,3,5,6,7};
        Q1TwoSum q1TwoSum = new Q1TwoSum();

        int[] a = q1TwoSum.q1twoSum(array, 8);
        int[] b = q1TwoSum.q1twoSum2(array,8);

        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i] + " ");
        }

        for ( int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        output: 0 5 0 5

 */
