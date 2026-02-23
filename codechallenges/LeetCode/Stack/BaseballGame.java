// https://leetcode.com/problems/baseball-game/
package Stack;

import java.util.Stack;

class BaseballGame{
    public int calPoints(String[] operations) {
        Stack<Integer> points = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            String s = operations[i];
            if(s.equals("+")){
                int top = points.pop();
                int second = points.peek();
                int value = top + second;
                points.push(top);
                points.push(value);
            }else if (s.equals("D")){
                points.push(points.peek() * 2);
            }
            else if(s.equals("C")){
                points.pop();
            }
            else{
                points.push(Integer.parseInt(s));
            }
        }
        int result = 0;
        while(!points.isEmpty()){
            result += points.pop();
        }
        return result;
    }
}