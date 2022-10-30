package com.tc.day02;

//第四题
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
//        如果一个数组为0那么中位数就是另一个数组的中位数了
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
//        将两个数组合到一个数组中
        while (count != (l1 + l2)) {
//nums1[]数组已经没值了则将nums2[]数组全都添加到nums3[]数组中
            if (i == l1) {
                while (j != l2) {
                    nums3[count++] = nums2[j++];
                }
                break;
            }
//nums2[]数组已经没值了则将nums1[]数组全都添加到nums3[]数组中
            if (j == l2) {
                while (i != l1) {
                    nums3[count++] = nums1[i++];
                }
                break;
            }
//将值小的先放入nums3数组中
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
