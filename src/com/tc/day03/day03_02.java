package com.tc.day03;

import java.util.ArrayList;
import java.util.List;

//第六题 Z字形变换
public class day03_02 {

    public static void main(String[] args) {
        String paypalishiring = convert("AB", 1);
        System.out.println(paypalishiring);
    }

    public static String convert(String s, int numRows) {
        if (numRows < 2) return s;
        int i = 0;
        int flag = -1;
        List<StringBuilder> list = new ArrayList<>();
        int j=0;
        while ( j < numRows) {
            list.add(new StringBuilder());
            j++;
        }
        for (char c : s.toCharArray()) {
            list.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i=i+flag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder builder : list) {
            stringBuilder.append(builder);

        }
        return stringBuilder.toString();
    }
}
