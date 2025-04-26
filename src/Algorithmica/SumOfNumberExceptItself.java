package Algorithmica;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumberExceptItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int k = 1; k <= loop; k++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] result = new int[n];
            int sum = 0;
            for (int j =0;j<arr.length;j++){
                sum += arr[j];
            }
            System.out.println(sum);
            for(int l = 0;l<result.length;l++){
                result[l] = sum-arr[l];
            }

                System.out.println(Arrays.toString(result));
        }
    }
}