package LeetCode.String.RomanToInteger;

public class App {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case 'I':
                    sum += getNum(c);
                    break;
                case 'V':
                case 'X':
                    if(i - 1 >= 0 && s.charAt(i-1) == 'I')  sum += getNum(c) - getNum('I');
                    else sum += getNum(c);
                    break;
                case 'L':
                case 'C':
                    if(i - 1 >= 0 && s.charAt(i-1) == 'X')  sum += getNum(c) - getNum('X');
                    else sum += getNum(c);
                    break;
                case 'D':
                case 'M':
                    if(i - 1 >= 0 && s.charAt(i-1) == 'C')  sum += getNum(c) - getNum('C');
                    else sum += getNum(c);
                    break;
            }
        }

        for(int i = 0; i < s.length() - 1; i++){
            char c = s.charAt(i);
            char nextC = s.charAt(i + 1);

            if(c == 'I' && (nextC == 'V' || nextC  == 'X')) sum -= getNum('I');
            if(c == 'X' && (nextC == 'L' || nextC  == 'C')) sum -= getNum('X');
            if(c == 'C' && (nextC == 'D' || nextC  == 'M')) sum -= getNum('C');
        }

        return sum;
    }

    private static int getNum(char c){
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;
    }
}
