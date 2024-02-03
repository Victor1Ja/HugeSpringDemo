package me.vitocode.hs.javademo.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TasksController {

    @PostMapping("/v1/task1")
    public Boolean taskNumber1(@RequestBody String cString) {
        if (!isNumeric(cString))
            return false;

        if (isPalindrome(cString))
            return true;

        return false;
    }

    protected Boolean isPalindrome(String cString) {
        int n = cString.length();
        for (int i = 0; i < n; i++) {
            if (cString.charAt(i) != cString.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @PostMapping("/v1/task2")
    public Boolean taskNumber2(@RequestBody String cString) {
        if (!isParenthesis(cString))
            return false;

        if (isValidBracket(cString))
            return true;

        return false;
    }

    protected Boolean isValidBracket(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    protected boolean isNumeric(String cString) {
        return cString.matches("-?\\d+(\\.\\d+)?");
    }

    protected Boolean isParenthesis(String cString) {
        return cString.matches(".*[(){}\\[\\]].*");
    }
}
