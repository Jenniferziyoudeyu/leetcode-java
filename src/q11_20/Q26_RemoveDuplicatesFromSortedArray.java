package q11_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        //nums == null不写的话，for loop会崩溃 null pointer exception
        if (nums == null) return 0;
        List<Integer> numList = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            if (!numSet.contains(i)) {
                numList.add(i);
                numSet.add(i);
            }
        }
        for (int i = 0; i < numList.size(); i++) {
            nums[i] = numList.get(i);
        }

        return numList.size();
    }

    public int removeDuplicates3(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                //++slow 是当前slow的下一位变成和fast一样的值
                nums[++slow] = nums[fast];
            }
        }
        return slow + 1;
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


}
