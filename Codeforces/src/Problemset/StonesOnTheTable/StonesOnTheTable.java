package Problemset.StonesOnTheTable;
// problem: https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numOfStones = scanner.nextInt();
        String colorOfStones = scanner.next();
        int minimumNumOfStones = 0;

        for (int i = 0; i < numOfStones - 1; i++) {
            if (colorOfStones.charAt(i) == colorOfStones.charAt(i+1)){
                minimumNumOfStones += 1;
            }
        }

        System.out.println(minimumNumOfStones);
    }
}
