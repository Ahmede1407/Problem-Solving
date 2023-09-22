package Problemset.Football;
// problem: https://codeforces.com/problemset/problem/96/A

import java.util.Scanner;

public class Football {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String playersPosition = scanner.next();
        int ones = 0;
        int zeros = 0;

            for (int i = 0; i < playersPosition.length() ; i++) {
                if (playersPosition.charAt(i) == '1'){
                    ones++;
                } else if (playersPosition.charAt(i) == '0') {
                    zeros++;
                }
                if (zeros<7 && playersPosition.charAt(i)=='1'){
                    zeros = 0;
                } else if (ones<7 && playersPosition.charAt(i) == '0') {
                    ones = 0;
                }
            }

        if (ones >= 7 || zeros >= 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
