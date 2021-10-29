package com.xyz.algorithm.leetcode;

import com.xyz.algorithm.base.sign.BinarySearch;

/**
 * Sqrt(x)（https://leetcode-cn.com/problems/sqrtx/）
 *
 * @author xyz
 * @date 2021/10/29
 **/
public class Leetcode_69 implements BinarySearch {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        int lastValue = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            long tmp = (long) middle * middle;
            if (tmp == x) {
                return middle;
            } else if (tmp < x) {
                left = middle + 1;
                lastValue = Math.max(middle, lastValue);
            } else {
                right = middle - 1;
            }
        }

        return lastValue;
    }

    public static void main(String[] args) {
        Leetcode_69 o = new Leetcode_69();

        // 测试用例 x=4 结果：2
        int x = 2147395599;

        System.out.println(o.mySqrt(x));
    }


}
