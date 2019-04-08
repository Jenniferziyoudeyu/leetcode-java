package q11_20;

import java.util.Stack;

public class Q20_ValidParentheses {
    public boolean isValid1(String s) {
        if (s.length() == 0) return true;
        if(s.length() % 2 != 0) return false;
        int size = s.length();

        //注意 i < size - 1 不然会越界
        for (int i = 0; i < size - 1; i++) {
            if (removable(s.charAt(i), s.charAt(i + 1))) {
                s = s.substring(0, i) + s.substring(i + 2);
                size = s.length();
                i = -1;
            }
        }
        return s.length() == 0;

    }

    static boolean removable (char a, char b) {
        return (a == '{' && b == '}' ||
                a == '[' && b == ']'
                || a == '(' && b == ')');

    }

    public boolean isValidStack(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{'|| s.charAt(i) == '['|| s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}'|| s.charAt(i) == ']'|| s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                switch (s.charAt(i)) {
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                            break;
                        } else return false;
                    case ']':
                        if (stack.peek() == '[') {
                            stack.pop();
                            break;
                        } else return false;
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                            break;
                        } else return false;
                    default:
                        break;
                }
            }
        }
        return stack.isEmpty();
    }





}
