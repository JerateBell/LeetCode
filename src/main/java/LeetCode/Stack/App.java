package LeetCode.Stack;

import java.util.Stack;

public class App {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        int count = 0;

        for(char c : s.toCharArray()){
            stack.push(c);
        }

        while(!stack.empty()){
            char c = stack.pop();

            if (c == '*') count++;
            else {
                if(count == 0) res = String.valueOf(c)  + res;
                else count--;
            }
        }

        return res;
    }
}
