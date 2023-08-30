package Problemset.StringTask;
// problem: https://codeforces.com/problemset/problem/118/A

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next().toLowerCase();
        String charactersToRemove = "aoyeui";


        for (char c : charactersToRemove.toCharArray()) {
            str = str.replace(Character.toString(c), "");
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.print("." + str.charAt(i));
        }

    }
}
