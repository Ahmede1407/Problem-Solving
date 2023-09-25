package Problemset.Translation;
// problem: https://codeforces.com/problemset/problem/41/A

import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = new StringBuilder(scanner.next()).reverse().toString();

        if (firstWord.equals(secondWord)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
