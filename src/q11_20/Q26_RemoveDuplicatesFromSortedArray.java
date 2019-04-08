package q11_20;

import java.util.ArrayList;
import java.util.List;

public class Q26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if ( nums == null || nums.length == 0) return 0;
        List<Integer> numList = new ArrayList<>();
        for (int i : nums) {
            if (!numList.contains(i)) {
                numList.add(i);
            }
        }
        for (int i = 0; i < numList.size(); i++) {
            nums[i] = numList.get(i);
        }

        return numList.size();
    }

    //test
    public static void main(String[] args) {
        Q26_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new Q26_RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,1,2,2,3};
        System.out.print("\nnew array length is: " + removeDuplicatesFromSortedArray.removeDuplicates(nums));

    }

    /*
    output:
    1 2 3
    new array length is: 3
     */

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 1;
        for (int i : nums) {
            if (i != nums[count]) count++;
            nums[count] = i;
        }
        return count;
    }

}
