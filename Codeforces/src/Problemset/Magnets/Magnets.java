package Problemset.Magnets;
// Problem: https://codeforces.com/problemset/problem/344/A

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        char c = ' ';
        int magnets = scanner.nextInt();
        int groups = 1;

        for (int i = 0; i < magnets; i++) {
            str = scanner.next();
            if (str.charAt(0) == c) {
                groups++;
            }
            c = str.charAt(1);
        }

        System.out.println(groups);

    }
}
