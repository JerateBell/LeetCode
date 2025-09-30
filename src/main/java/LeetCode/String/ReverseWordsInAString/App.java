package LeetCode.String.ReverseWordsInAString;

public class App {
    public String reverseWords(String s) {
        String[] arr = s.split("\s+");
        StringBuilder res = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--){
            res.append(arr[i]);
            res.append(" ");
        }

        return res.toString().trim();
    }
}
