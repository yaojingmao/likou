package com.tc.day02;


public class day02_2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] nums3 = new int[l1 + l2];
        if (l1 == 0) {
            if (l2 % 2 == 0) {
                return (nums2[l2 / 2 - 1] + nums2[l2 / 2]) / 2.0;
            } else {
                return nums2[l2 / 2];
            }
        }
        if (l2 == 0) {
            if (l1 % 2 == 0) {
                return (nums1[l1 / 2 - 1] + nums1[l1 / 2]) / 2.0;
            } else {
                return nums1[l1 / 2];
            }
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (count != (l1 + l2)) {

            if (i == l1) {
                while (j != l2) {
                    nums3[count++] = nums2[j++];
                }
                break;
            }

            if (j == l2) {
                while (i != l1) {
                    nums3[count++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums3[count++] = nums1[i++];
            } else {
                nums3[count++] = nums2[j++];
            }
        }

        if (count % 2 == 0) {
            return (nums3[count / 2 - 1] + nums3[count / 2]) / 2.0;
        } else {
            return nums3[count / 2];
        }

    }
}
