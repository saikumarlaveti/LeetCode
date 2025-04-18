package Leetcode;

public class LC_2176_CountEqualAndDivisiblePairs{
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && i*j %k==0 && i<j){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(arr,k)); //4
    }
}
