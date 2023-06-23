package Problemset.PetyaAndStrings;
// problem: https://codeforces.com/problemset/problem/112/A

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String firstStr = scanner.next().toLowerCase();
        String secondStr = scanner.next().toLowerCase();

        // create for loop to iterate through all the characters in the two words
        // note that the two strings are in the same length.
        for (int i = 0; i < firstStr.length(); i++) {
            // check if char in the first string is greater than its counterpart in the second string the prints 1 and return to stop the loop
            if (firstStr.charAt(i) > secondStr.charAt(i)){
                System.out.println(1);
                return;
            }
            // check if char in the first string is lower than its counterpart in the second string the prints -1 and return to stop the loop
            else if (firstStr.charAt(i) < secondStr.charAt(i)){
                System.out.println(-1);
                return;
            }
        }
        // if all chars are the same and finishing the loop, then prints 0
        System.out.println(0);
    }
}
