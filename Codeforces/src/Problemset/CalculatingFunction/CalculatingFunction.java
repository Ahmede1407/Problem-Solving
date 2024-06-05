package Problemset.CalculatingFunction;
// problem: https://codeforces.com/problemset/problem/486/A


import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();

        if (num % 2 == 0){
            System.out.println((num / 2));
        }
        else {
            System.out.println( (-1 * (num / 2 + 1)));
        }
    }
}
