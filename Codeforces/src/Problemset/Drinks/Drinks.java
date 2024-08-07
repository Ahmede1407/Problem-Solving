package Problemset.Drinks;
// problem: https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numbOfOranges = scanner.nextInt();
        float totalVolumePercent = 0;

        for (int i = 0; i < numbOfOranges; i++) {
            totalVolumePercent += scanner.nextFloat();
        }

        System.out.println(totalVolumePercent/numbOfOranges);
    }
}
