package LeetCode.String.MergeStringsAlternately1768;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
        System.out.println("Result: " + mergeAlternately(str1, str2));
    }

    public static String mergeAlternately(String str1, String str2) {
        StringBuilder res = new StringBuilder();
        int maxLength = Math.max(str1.length(), str2.length());
        for(int i= 0 ; i< maxLength; i++){
            if(i < str1.length()){
                res.append(str1.charAt(i));
            }
            if(i < str2.length()){
                res.append(str2.charAt(i));
            }
        }
        return res.toString();

}
}
