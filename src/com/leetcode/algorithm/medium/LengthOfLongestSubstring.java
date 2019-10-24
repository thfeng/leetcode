package com.leetcode.algorithm.medium;

import java.util.ArrayList;
import java.util.Iterator;

public class LengthOfLongestSubstring {
    public int findLengthOfLongestSubstring(String s) {
        ArrayList<Character> longestStrCharArr = new ArrayList<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> currentCharArr = new ArrayList<>();
            currentCharArr.add(charArr[i]);
            for (int j = i + 1; j < charArr.length; j++) {
                if(!currentCharArr.contains(charArr[j])) {
                    currentCharArr.add(charArr[j]);
                } else {
                    break;
                }
            }

            if(currentCharArr.size() > longestStrCharArr.size()) {
                longestStrCharArr = currentCharArr;
            }
        }
        return longestStrCharArr.size();
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        int result = solution.findLengthOfLongestSubstring(" ");
        System.out.println(result);
    }
}
