package com.tc;

import java.util.Arrays;
//力扣第一题
public class day01 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3,2,5}, 6);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] index=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (target-nums[i]==nums[j]){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return new int[0];
    }

}
