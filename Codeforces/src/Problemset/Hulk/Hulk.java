package Problemset.Hulk;

// problem: https://codeforces.com/problemset/problem/705/A

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLayers = scanner.nextInt();
        StringBuilder feelings = new StringBuilder();

        for (int i = 1; i <= numberOfLayers; i++) {
            if (i == 1) {
                feelings = new StringBuilder();
            } else if (i % 2 == 0) {
                feelings.append(" that I love");
            } else {
                feelings.append(" that I hate");
            }
        }

        System.out.println("I hate" + feelings + " it");

    }
}
