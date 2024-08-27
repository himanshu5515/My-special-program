import  java.util.*;
public class longest_valid_parenthisis {
    public  static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;
    }

    public static void main(String[] args) {
        String s = ")()()))()(())()()(";
        System.out.println(longestValidParentheses(s));
    }
}