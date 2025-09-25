package LeetCode.DynamicProgramming.PascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows == 0){
            return res;
        }

        if(numRows == 1){
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            res.add(firstRow);
            return res;
        }

        res = generate(numRows - 1);
        List<Integer> previousRow = res.get(numRows -2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for(int i = 1; i < numRows - 1; i++){
            currentRow.add(previousRow.get(i - 1) + previousRow.get(i));
        }

        currentRow.add(1);
        res.add(currentRow);
        return res;
    }
}
