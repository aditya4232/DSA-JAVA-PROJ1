package com.dsa.core.strings;

/**
 * String utility methods for common operations
 */
public class StringUtils {

    /**
     * Reverse a string
     */
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    /**
     * Check if string is palindrome
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    /**
     * Check if two strings are anagrams
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;
        for (char c : s2.toCharArray()) {
            if (--count[c - 'a'] < 0) return false;
        }
        return true;
    }

    /**
     * Find first non-repeating character
     */
    public static char firstNonRepeating(String s) {
        if (s == null || s.isEmpty()) return '\0';
        int[] count = new int[256];
        for (char c : s.toCharArray()) count[c]++;
        for (char c : s.toCharArray()) {
            if (count[c] == 1) return c;
        }
        return '\0';
    }

    /**
     * Check if string contains only digits
     */
    public static boolean isNumeric(String s) {
        if (s == null || s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    /**
     * Count vowels in string
     */
    public static int countVowels(String s) {
        if (s == null || s.isEmpty()) return 0;
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    /**
     * Remove duplicates from string (preserving order)
     */
    public static String removeDuplicates(String s) {
        if (s == null || s.length() <= 1) return s;
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Longest common prefix among strings
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    /**
     * Compress string (aabcccccaaa -> a2b1c5a3)
     */
    public static String compress(String s) {
        if (s == null || s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = s.charAt(i);
                count = 1;
            }
        }
        sb.append(prev).append(count);
        String compressed = sb.toString();
        return compressed.length() < s.length() ? compressed : s;
    }

    /**
     * Check if one string is rotation of another
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    /**
     * Find longest substring without repeating characters
     */
    public static int longestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int[] index = new int[128];
        int maxLen = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(index[s.charAt(i)], start);
            maxLen = Math.max(maxLen, i - start + 1);
            index[s.charAt(i)] = i + 1;
        }
        return maxLen;
    }
}
