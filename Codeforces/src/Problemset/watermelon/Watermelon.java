package Problemset.watermelon;

// problem: https://codeforces.com/problemset/problem/4/A


import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

     int weight = scanner.nextInt();


        if (weight <=2){
            System.out.println("NO");
            return;
        }
        if (weight % 2 == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }


}
