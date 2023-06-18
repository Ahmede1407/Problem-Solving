package Problemset.DominoPiling;
// problem: https://codeforces.com/problemset/problem/50/A

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int area = width * height;
        int maxNumberOfDominoes = area / 2;

        System.out.println(maxNumberOfDominoes);
    }
}
