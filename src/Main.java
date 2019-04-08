import q11_20.Q20_ValidParentheses;
import q11_20.Q26_RemoveDuplicatesFromSortedArray;
import q1_10.Q1TwoSum;

public class Main {

    public static void main(String[] args) {
        Q26_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new Q26_RemoveDuplicatesFromSortedArray();
        int count = removeDuplicatesFromSortedArray.removeDuplicates2(new int[]{1,1,1,1,1,2,2,2,3,3,3,3,4,5,5,5,6,6,6,6});
        System.out.print(count);

    }
}
