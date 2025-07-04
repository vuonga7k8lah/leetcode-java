package com.vuongkma.leetcodejava.Easy;

import com.vuongkma.leetcodejava.BoilerplateInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Stack;

@Slf4j(topic = "====ValidParentheses===")
@Component
public class ValidParentheses implements BoilerplateInterface {
    @Override
    public void descriptionProblem() {
//        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//                An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//                Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "()[]{}"
//
//        Output: true
//
//        Example 3:
//
//        Input: s = "(]"
//
//        Output: false
//
//        Example 4:
//
//        Input: s = "([])"
//
//        Output: true
    }

    @Override
    public void run() {
        System.out.println("case 1:");
        System.out.println(this.isValid("()"));
        System.out.println("case 2:");
        System.out.println(this.isValid("()[]{}"));
        System.out.println("case 3:");
        System.out.println(this.isValid("([])"));
    }

    public boolean isValid(String s) {
        if (s.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }
}
