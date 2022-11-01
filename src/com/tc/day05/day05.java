package com.tc.day05;
//第九题
public class day05 {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(int x) {
        int a=x;
        int reverseNum = 0;
        if (x < 0 || (x % 10 == 0 && x!=0)) {
            return false;
        }
        while (x !=0) {
            int num = x % 10;
            reverseNum = reverseNum * 10 + num;
            x=x/10;
        }
        return reverseNum==a ;
    }
}
