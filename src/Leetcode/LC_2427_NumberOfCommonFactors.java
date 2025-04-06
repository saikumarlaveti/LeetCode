package Leetcode;

public class LC_2427_NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int count = 1;
        int large =  Math.max(a,b);
        for(int i = 2;i<=large;i++){
            if(a%i == 0 && b%i == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(commonFactors(2,6));
        System.out.println(commonFactors(25,30));
    }
}
