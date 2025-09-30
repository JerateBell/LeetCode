package LeetCode.Stack.AsteroidCollision;

import java.util.Stack;

public class App {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (Math.abs(i) > stack.peek()) {
                    stack.pop();
                } else if (Math.abs(i) == stack.peek()) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(i);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
