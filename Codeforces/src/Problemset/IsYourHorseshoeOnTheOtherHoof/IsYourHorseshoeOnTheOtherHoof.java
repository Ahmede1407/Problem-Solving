package Problemset.IsYourHorseshoeOnTheOtherHoof;
// problem: https://codeforces.com/problemset/problem/228/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> colors = new ArrayList<>();

        int minNumberOfHorseShoes = 0;

        for (int i = 0; i < 4; i++) {
            colors.add(scanner.nextInt());
        }

        Collections.sort(colors);

        for (int i = 0; i < 3; i++) {
            if (Objects.equals(colors.get(i), colors.get(i + 1))) {
                minNumberOfHorseShoes++;
            }
        }

        System.out.println(minNumberOfHorseShoes);
    }
}
