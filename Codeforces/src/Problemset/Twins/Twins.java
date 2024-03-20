package Problemset.Twins;
// problem: https://codeforces.com/problemset/problem/160/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCoins = scanner.nextInt();
        ArrayList<Integer> coins = new ArrayList<>();
        int sumsOfCoins = 0;
        int minimumNumOfCoins = 0;
        int totalValue = 0;

        for (int i = 0; i < numberOfCoins; i++) {
            coins.add(scanner.nextInt());
            sumsOfCoins += coins.get(i);
        }

        coins.sort(Collections.reverseOrder());

        for (int i = 0; i < numberOfCoins; i++) {
            totalValue += coins.get(i);
            minimumNumOfCoins++;

            if (totalValue > (sumsOfCoins / 2))
                break;
        }

        System.out.println(minimumNumOfCoins);

    }
}
