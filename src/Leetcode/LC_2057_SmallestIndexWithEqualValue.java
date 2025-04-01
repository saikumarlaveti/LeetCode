package Leetcode;

public class SmallestIndexWithEqualValue_2057 {
    public int smallestEqual(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        SmallestIndexWithEqualValue_2057 sim = new SmallestIndexWithEqualValue_2057();
        System.out.println(sim.smallestEqual(arr));
        int[]b ={4,3,2,1};
        System.out.println(sim.smallestEqual(b));
    }
}
