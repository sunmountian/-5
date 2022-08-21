package com.HashTable;

/**
 * @version 1.0
 * @authoe 李祥基
 */
public class canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] record = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            record[ransomNote.charAt(i) - 'a'] -= 1;
            if (record[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
