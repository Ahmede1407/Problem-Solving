package Problemset.NearlyLuckyNumber;
// problem: https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String stringNum = scanner.next();

        int counter = 0;


        for (int i = 0; i < stringNum.length(); i++) {
            if (stringNum.charAt(i) == '4' || stringNum.charAt(i) == '7'){
                counter++;
            }
        }

        if (counter == 4 || counter == 7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
