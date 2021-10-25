package com.xyz.algorithm.leetcode;

import com.xyz.algorithm.base.sign.BinarySearch;

/**
 * 二分查找（https://leetcode-cn.com/problems/binary-search/）
 *
 * @author xyz
 * @date 2021/10/25
 **/
public class Leetcode_704 implements BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Leetcode_704 o = new Leetcode_704();

        // 测试用例 nums = [-1,0,3,5,9,12], target = 9 结果：4
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(o.search(nums, target));
    }


}
