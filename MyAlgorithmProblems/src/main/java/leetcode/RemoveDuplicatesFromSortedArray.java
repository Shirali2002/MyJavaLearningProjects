package leetcode;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int[] expectedNums = removeDuplicates(nums);
        for (int i = 0; i < expectedNums.length; i++) {
            System.out.print(expectedNums[i]+ ", ");
        }

    }
    public static int[] removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        expectedNums[0] = nums[0];
        int k=1;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != expectedNums[k-1]){
                expectedNums[k] = nums[i];
                k++;
            }
        }
        return expectedNums;
    }
}
