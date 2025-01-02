package Array;

import java.util.Arrays;
    class Day_1 {
        public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
            int length = nums.length;
            for(int i = 0 ;i<length;i++){
                for(int j = i+1 ;j<length;j++){
                    if(nums[i]+nums[j] == target){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] num  = {3,2,4};
            Day_1 s = new Day_1();
            int[] res =    s.twoSum(num,6);
            System.out.println(Arrays.toString(res));
        }
    }

