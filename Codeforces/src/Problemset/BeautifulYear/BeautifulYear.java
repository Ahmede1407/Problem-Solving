package Problemset.BeautifulYear;
// problem: https://codeforces.com/problemset/problem/271/A

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int starterYear = scanner.nextInt();
        int nextBeautifulYear = 0;

        while (true){
            starterYear++;
            int a = starterYear/1000;
            int b = starterYear/100%10;
            int c = starterYear/10%10;
            int d = starterYear%10;

            if (a != b && a != c && a != d && b != c && b != d && c != d){
                nextBeautifulYear = starterYear;
                break;
            }
        }

        System.out.println(nextBeautifulYear);

    }
}
