// https://leetcode.com/problems/valid-parentheses/
package Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <  s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                if(pairCheck(stack.peek(), c)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
    public boolean pairCheck(char last, char current){
        return (last == '(' && current == ')') || (last == '[' && current == ']') || (last == '{' && current == '}');
    }
}
