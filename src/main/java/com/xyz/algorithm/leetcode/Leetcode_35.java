package com.xyz.algorithm.leetcode;

import com.xyz.algorithm.base.sign.BinarySearch;

/**
 * 搜索插入位置（https://leetcode-cn.com/problems/search-insert-position/）
 *
 * @author xyz
 * @date 2021/10/25
 **/
public class Leetcode_35 implements BinarySearch {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int lastIndex = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                lastIndex = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return lastIndex + 1;
    }

    public static void main(String[] args) {
        Leetcode_35 o = new Leetcode_35();

        // 测试用例 nums = [1,3,5,6] target = 7 结果：4
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;

        System.out.println(o.searchInsert(nums, target));
    }


}
