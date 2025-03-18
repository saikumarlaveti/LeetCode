package Leetcode;

public  class MaximumCountNegPos_2529 {
    public  int maximumCount(int[] nums) {
        int Negative = 0;
        int Positive = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] <0){
                Negative++;
            }
            else if(nums[i]>0){
                Positive++;
            }
        }
        return Math.max(Negative,Positive);

//         Long Negative  = Arrays.stream(nums).filter(i->i<0).count();
//         Long Positive = Arrays.stream(nums).filter(i->i>0).count();
//         return (int) Math.max(Negative,Positive);




    }
    public static void main(String[] args) {
            int[] arr = {-2,-1,-1,1,2,3};
            int[] brr = {-3,-2,-1,0,0,1,2};
            int[] crr = {5,20,66,1314};

            MaximumCountNegPos_2529 mcn = new MaximumCountNegPos_2529();
            System.out.println(mcn.maximumCount(arr));
            System.out.println(mcn.maximumCount(brr));
            System.out.println(mcn.maximumCount(crr));



    }
}
