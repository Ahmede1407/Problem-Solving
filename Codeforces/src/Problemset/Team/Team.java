package Problemset.Team;

// problem: https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfProblems = scanner.nextInt();
        int count = 0;

        //create array based on the number of problems and loop through it to check how many of them can the 3 friends solve
        for (int i = 0; i < numOfProblems; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            // Check if at least two friends are sure about the solution
            if ((petya + vasya + tonya) >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
