package Leetcode;

import java.util.Arrays;

public class LC_2574_LeftRightDifference {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));  // [15, 1, 11, 22]
    }
}
