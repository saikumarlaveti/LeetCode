package Leetcode;

import java.util.Arrays;

public class LC_238_ProductOfArrayExceptSelf {
    public  static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result  = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));   //24 , 12 , 8 , 6
    }
}
