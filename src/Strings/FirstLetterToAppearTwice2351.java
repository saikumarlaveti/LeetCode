package Strings;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice2351 {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '0';
    }
    public static void main(String[] args) {
        FirstLetterToAppearTwice2351 d = new FirstLetterToAppearTwice2351();
        String name = "abcbacz";
        System.out.println(d.repeatedCharacter(name));
    }
}
