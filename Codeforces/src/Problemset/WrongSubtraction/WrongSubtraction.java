package Problemset.WrongSubtraction;
// problem: https://codeforces.com/problemset/problem/977/A

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int numOfSubtractions = scanner.nextInt();

        for (int i = 0; i < numOfSubtractions; i++) {
            if (num % 10 == 0){
                num = num / 10;
            }else {
                num = num - 1;
            }
        }
        System.out.println(num);
    }
}
