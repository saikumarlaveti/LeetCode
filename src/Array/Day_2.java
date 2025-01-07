package Array;

public class Day_2 {
    public int searchInsert(int[] nums, int target) {
        boolean result = false;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == target){
                    result  = true;
                    return i;
                }
            }
            if(result == false){
                for(int i = 0;i<nums.length;i++){
                    if(nums[i]<target ){

                    }
                    else{
                        return i;
                    }
                }
            }
            return nums.length;
    }
    public static void main(String[] args) {
        int[] arr = { 1,3,5,6};
        Day_2 d2 = new Day_2();
        int value = d2.searchInsert(arr,7);
        System.out.println(value);
    }
}
