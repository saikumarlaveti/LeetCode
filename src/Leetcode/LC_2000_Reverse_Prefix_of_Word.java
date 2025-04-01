package Leetcode;
public class Reverse_Prefix_of_Word_2000 {


    public String reversePrefix(String word, char ch) {

        int index = -1;
        char[] wordArr = word.toCharArray();
        for(int i = 0;i<wordArr.length;i++){
            if(wordArr[i] == ch){
                index = i;
                break;
            }
        }
        if(index == -1){
            return word;
        }
        int start = 0;
        int end = index;
        while(start<end){
            char temp = wordArr[start];
            wordArr[start] = wordArr[end];
            wordArr[end] = temp;
            start++;
            end--;
        }
return new String(wordArr);
        }

    public static void main(String[] args) {
        Reverse_Prefix_of_Word_2000 rp = new Reverse_Prefix_of_Word_2000();
        String word = rp.reversePrefix("saikumar",'i');
        System.out.println(word);
        System.out.println(rp.reversePrefix("saikumar",'k'));
        System.out.println(rp.reversePrefix("saikumar",'l'));

    }
}