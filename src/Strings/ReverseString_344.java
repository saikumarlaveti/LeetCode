package Strings;

public class ReverseString_344 {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length-1;
            while(left<right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
            System.out.println(s);
        }

    public static void main(String[] args) {
        ReverseString_344 rs = new ReverseString_344();
        char[] s = {'h','e','l','l','o'};
        rs.reverseString(s);
    }
}
