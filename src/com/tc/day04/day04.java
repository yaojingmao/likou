package com.tc.day04;

import java.util.Arrays;
//第七题
public class day04 {
    public static void main(String[] args) {
        int reverse = reverse(-123456);
        System.out.println(reverse);
    }

    public static int reverse(int x) {

        int reverse = 0;
        while (x != 0) {
            int a = x % 10;
//            当x=0时应该还要进行判断一次
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverse = reverse * 10 + a;
            x = x / 10;
        }

        return reverse;
    }
}
