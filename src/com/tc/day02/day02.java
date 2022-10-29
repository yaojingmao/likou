package com.tc.day02;

import java.util.HashMap;
import java.util.Map;

//力扣第3题
public class day02 {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s) {
        //创建一个map集合记录不重复的子串
        Map<Character, Integer> map = new HashMap<>();
        //记录左指针
        int left = 0;
        //记录最大子串长度
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果map中有该字符则将该字符从map中移去，再将值添加进去否则就直接添加
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);

            }
            //比较当前的子串长度与以前的最大子串长度
          maxLength=  Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
