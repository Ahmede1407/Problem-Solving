package Problemset.SoldierAndBananas;
// problem: https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int costOfTheFirstBanana = scanner.nextInt();
        int initialMoney = scanner.nextInt();
        int numOfBananas = scanner.nextInt();

        int moneyBorrowed;
        int totalCost = 0;

        for (int i = 1; i <= numOfBananas; i++) {
            totalCost += costOfTheFirstBanana * i;
        }

        if (initialMoney - totalCost > 0){
            moneyBorrowed = 0;
        } else {

            moneyBorrowed = Math.abs(initialMoney - totalCost);
        }

        System.out.println(moneyBorrowed);
    }
}
