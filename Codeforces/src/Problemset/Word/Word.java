package Problemset.Word;
// problem: https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int numOfLowercaseChars = 0;
        int numOfUppercaseChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)){
                numOfLowercaseChars += 1;
            }else {
                numOfUppercaseChars += 1;
            }
        }
        if (numOfLowercaseChars >= numOfUppercaseChars){
            str = str.toLowerCase();
        } else {
            str = str.toUpperCase();
        }

        System.out.println(str);

    }
}
