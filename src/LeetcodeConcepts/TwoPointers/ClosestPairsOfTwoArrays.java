package LeetcodeConcepts.TwoPointers;

import java.util.ArrayList;

public class ClosestPairsOfTwoArrays {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {

        int left = 0;
        int right = m-1;
        ArrayList<Integer> pc = new ArrayList<>();
        while (left<right){
            int sum = arr[left] + brr[right];
            while(left<right){
                if(sum>x){
                    right--;
                } else if (sum<x) {
                    left++;
                }
            }
            pc.add(left);
            pc.add(right);
        }
        return pc;
    }

    public static void main(String[] args) {
        int N = 4;
        int  M = 4;
        int arr[ ] = {1, 4, 5, 7};
        int brr[ ] = {10, 20, 30, 40};
        int X = 32;
        ArrayList<Integer> res = printClosest(arr,brr,N,M,X);
        System.out.println(res);
    }
}
