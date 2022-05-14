package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        String input = myInput();
        boolean ans = isValid(input);
        System.out.println(ans);

    }

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character myChar = s.charAt(i);
            if (myChar == '(' || myChar == '[' || myChar == '{') {
                myStack.push(myChar);
            } else if (myStack.empty() && (myChar == ')' || myChar == ']' || myChar == '}')) {
                return false;
            } else if (myChar == ')' || myChar == ']' || myChar == '}') {
                Character stackChar = myStack.pop();
                switch (stackChar) {
                    case '(':
                        if (myChar != ')') return false;
                        break;
                    case '[':
                        if (myChar != ']') return false;
                        break;
                    case '{':
                        if (myChar != '}') return false;
                        break;
                }
            }

        }

        if (!myStack.empty()) return false;
        return true;

    }

    public static String myInput() {
        String input = new Scanner(System.in).next();
        return input;
    }


    public static boolean isValidNotGood(String s) {
        Stack<Character> myStack = stackGenerator(s);
        int bracket = 0;
        int squareBracket = 0;
        int curlyBracket = 0;
        while (!myStack.empty()) {
            Character symbol = myStack.pop();
            switch (symbol) {
                case '(':
                    bracket++;
                    break;
                case ')':
                    bracket--;
                    break;
                case '[':
                    squareBracket++;
                    break;
                case ']':
                    squareBracket--;
                    break;
                case '{':
                    curlyBracket++;
                    break;
                case '}':
                    curlyBracket--;
                    break;
            }
            if (bracket < 0 || squareBracket < 0 || curlyBracket < 0) {
                return false;
            } else if (bracket == 1 && squareBracket == 1 || bracket == 1 && curlyBracket == 1 || squareBracket == 1 && curlyBracket == 1) {
                return false;
            }
        }
        if (bracket == 0 && squareBracket == 0 && curlyBracket == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Stack<Character> stackGenerator(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            myStack.push(s.charAt(i));

        }
        return myStack;
    }


}
