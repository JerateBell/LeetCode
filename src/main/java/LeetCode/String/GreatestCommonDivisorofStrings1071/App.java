package LeetCode.String.GreatestCommonDivisorofStrings1071;

public class App {
    public static void main(String[] args) {
        String str1 = "abcabc";
        String str2 = "abc";

        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1 )){
            return "";
        }
        int l1 = str1.length();
        int l2 = str2.length();

        return str1.substring(0,gcd(l1,l2));
    }

    private static int gcd(int a, int b){
        while(b !=0){
            int temp= a%b;
            a = b;
            b= temp;
        }
        return a;
    }
}
