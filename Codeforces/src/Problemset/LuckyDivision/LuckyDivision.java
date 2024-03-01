package Problemset.LuckyDivision;
// problem: https://codeforces.com/problemset/problem/122/A

import java.util.Scanner;

public class LuckyDivision {

    private static boolean isLuckyNum(int num) {
        while (num > 0) {
            int n = num % 10;
            if (n != 4 && n != 7) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    private static boolean isAlmostLucky(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isLuckyNum(i)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isAlmostLucky(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
