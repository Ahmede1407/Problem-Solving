package Problemset.InSearchOfAnEasyProblem;
// problem: https://codeforces.com/problemset/problem/1030/A

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = scanner.nextInt();
        boolean hard = false;

        for (int i = 0; i < numberOfPeople; i++) {
            int personAnswer = scanner.nextInt();
            if (personAnswer == 1) hard = true;
        }

        if (hard){
            System.out.println("HARD");
        }else {
            System.out.println("EASY");
        }
    };
}
