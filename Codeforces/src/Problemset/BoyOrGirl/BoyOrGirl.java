package Problemset.BoyOrGirl;
//problem: https://codeforces.com/problemset/problem/236/A

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int counter= 0;
        int flag = 1;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    flag =0;
                    break;
                }
            }
            if (flag == 1){
                counter++;
            }
            flag =1;
        }

        if (counter%2 ==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}