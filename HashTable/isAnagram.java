package com.HashTable;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode242
 */
public class isAnagram {
/*解题思路：
 * 根据题目，假设字符都为小写字母，因此定义一个空间大小为26的数组来记录字符串s里出现的次数，
 * 先遍历一下s，统计一下s中出现的字母的次数，同样，对于字符串t，对出现的字符映射到哈希表索引上的数值
 * 做-1操作，最后检查，recond数组中的元素是否为0，为0说明s和t是字母异位词，
 * */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] recond = new int[26];
        for (int i = 0; i < s.length(); i++) {
            recond[s.charAt(i) - 'a'] += 1;
            recond[t.charAt(i) - 'a'] -= 1;
        }
        for (int j : recond) {
            if (j != 0)
                return false;
        }
        return true;
    }
}