package Leetcode;

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        for(int i  =0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    res = true;
                    return res;
                }
            }
        }
        return res;
    }

    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Solution s = new Solution();
        System.out.println(s.containsDuplicate(arr));
            System.out.println(s.containsDuplicate1(arr));
    }
}