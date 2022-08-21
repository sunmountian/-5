package com.HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 349 两个数组的交集
 */
public class InterSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 ||
                nums2 == null || nums1.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for (int i : nums1)
            set1.add(i);
        for (int i : nums2) {
            if (set1.contains(i))
                resSet.add(i);
        }

        return resSet.stream().mapToInt(x -> x).toArray();
    }
}