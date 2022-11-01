package com.tc.day04;

import org.junit.Test;

//第八题 
public class day04_02 {
    public static void main(String[] args) {
        int i = myAtoi("+1");
        System.out.println(i);
    }

        public static int myAtoi(String s) {
            int r = 0, l = 0;;
            for (l = 0; l < s.length(); l++) {
                char c = s.charAt(l);
                if (c == ' ') continue;
                break;
            }
            if (l >= s.length()) return 0;
            char c = s.charAt(l);
            if (c >= '0' && c <= '9' || c == '+' || c == '-') {
                r = l + 1;
                while (r < s.length() && s.charAt(r) >= '0' && s.charAt(r) <= '9') r++;
                if (c == '-' || c == '+') l++;
                long ans = 0;
                for (int i = l; i < r; i++) {
                    int t = s.charAt(i) - '0';
                    ans = ans * 10 + t;
                    if (ans > Integer.MAX_VALUE) break;
                }
                if (c == '-') ans = -ans;
                if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                return (int)ans;
            }
            return 0;
        }
    }


