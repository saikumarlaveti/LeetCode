package Leetcode;

public class LC_3162FindNumberOfGoodPairs {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int  j = 0;j<nums2.length;j++){
                if(nums1[i] %(nums2[j]*k) == 0)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
   int[] nums1 = {1,2,4,12};
   int[] nums2 = {2,4};
        System.out.println(numberOfPairs(nums1,nums2,3)); //2
    }
}
