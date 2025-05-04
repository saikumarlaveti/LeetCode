package Leetcode;

public class LC_345_ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && vowels.indexOf(chars[left]) == -1){
                left++;
            }

            while(left<right && vowels.indexOf(chars[right]) == -1){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello World")); // hollo Werld
        System.out.println(reverseVowels("saikumar"));   // saukimar
    }
}
