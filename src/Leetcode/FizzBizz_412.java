package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBizz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i % 3 == 0 && i%5 == 0){
                arr.add( "FizzBuzz");
            }
            else if(i%3==0){
                arr.add("Fizz");
            }
            else if(i%5==0){
                arr.add("Buzz");
            }
            else{
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        FizzBizz_412 fb = new FizzBizz_412();
       List<String> res =  fb.fizzBuzz(5);
        System.out.println(res);
    }
}
