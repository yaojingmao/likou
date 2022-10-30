package com.tc.day03;

//第五题
public class day03 {


    public String longestPalindrome(String s) {

        if (s.length()<2){
            return s;
        }

        int length = s.length();
        int begin = 0;
        int maxLen = 1;
        char[] chars = s.toCharArray();
//        如果i等于4了j就不满足条件了
        for (int i = 0; i < length - 1; i++) {
//            chars数组最大下标就是length-1
            for (int j = i + 1; j < length; j++) {
                if (j - i + 1 > maxLen && isbumber(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    //回文数就是左边等于右边
    private boolean isbumber(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
