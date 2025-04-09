package Leetcode;

public class LC_1009_ComplementOfBase10 {
    public  static int bitwiseComplement(int n) {
        return ~n;
    }
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(7));

    }
}
