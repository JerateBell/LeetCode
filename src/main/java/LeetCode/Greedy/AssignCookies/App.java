package LeetCode.Greedy.AssignCookies;

import java.util.Arrays;

public class App {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length, m = s.length, i = 0, j = 0;

        while (i < m && j < n) {
            if (g[j] <= s[i]) j++;
            i++;
        }

        return j;
    }
}
