package com.xyz.algorithm.leetcode;

import com.xyz.algorithm.base.sign.BinarySearch;

/**
 * 第一个错误的版本（https://leetcode-cn.com/problems/first-bad-version/）
 *
 * @author xyz
 * @date 2021/10/25
 **/
public class Leetcode_278 implements BinarySearch {

    private static int bad;

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        int lastBad = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            boolean flag = isBadVersion(middle);
            if (flag) {
                lastBad = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return lastBad;
    }

    private boolean isBadVersion(int v) {
        return v >= bad;
    }

    public static void main(String[] args) {
        Leetcode_278 o = new Leetcode_278();

        // 测试用例 n = 5, bad = 4 结果：4
        int n = 4;
        bad = 4;

        System.out.println(o.firstBadVersion(n));
    }


}
