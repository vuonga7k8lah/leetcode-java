package com.vuongkma.leetcodejava.Easy;

import com.vuongkma.leetcodejava.BoilerplateInterface;
import org.springframework.stereotype.Component;

@Component
public class ValidPalindrome implements BoilerplateInterface {
    @Override
    public void descriptionProblem() {
//        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//                Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//                Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//                Since an empty string reads the same forward and backward, it is a palindrome.
    }
    @Override
    public void run() {
        System.out.println("case1: ");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("case2: ");
        System.out.println(isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        //handle regex
        String regexString = s.replaceAll("[^a-zA-Z0-9]", "");
        String stringClean = regexString.trim();
        String stringLowerCase = stringClean.toLowerCase();
        String revertString = new StringBuffer(stringLowerCase).reverse().toString();
        return stringLowerCase.equals(revertString);
    }


}
