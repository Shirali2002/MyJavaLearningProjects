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
        Stack<Character> myStack = stackGenerator(s);
        int bracket = 0;
        int squareBracket = 0;
        int curlyBracket = 0;
        while (!myStack.empty()){
            Character symbol = myStack.pop();
            switch (symbol){
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
            if (bracket<0 || squareBracket<0 || curlyBracket<0){
                return false;
            } else if (bracket==1 && squareBracket==1 || bracket==1 && curlyBracket==1 || squareBracket==1 && curlyBracket==1) {
                return false;
            }
        }
        if (bracket==0 && squareBracket==0 && curlyBracket==0) {
            return true;
        } else {
            return false;
        }
    }

    public static Stack<Character> stackGenerator(String s){
        Stack<Character> myStack = new Stack<>();
        for(int i = s.length()-1; i>=0; i--){
            myStack.push(s.charAt(i));

        }
        return myStack;
    }

    public static String myInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return input;
    }
}
