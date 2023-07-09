package Problemset.WordCapitalization;
// problem: https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.next();


        System.out.println(inputWord.substring(0,1).toUpperCase() + inputWord.substring(1));

    }
}
