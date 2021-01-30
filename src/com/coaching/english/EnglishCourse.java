package com.coaching.english;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EnglishCourse {

    private static Logger englishCourse = Logger.getLogger(EnglishCourse.class.getName());

    public static List<Character> checkVowels(String word){
        word = word.toLowerCase();
        List<Character> vowels = new ArrayList<>();
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == 'a'|| word.charAt(i) == 'e'|| word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                englishCourse.info("Given string contains "+word.charAt(i)+" At the index "+i);
                 vowels.add(word.charAt(i));
            }
        }
        return vowels;
    }

    public static boolean palindrome(String word){
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;

    }

    public static String getSubString(String word ,int n){
      return  word.substring(0, n);
    }
}
