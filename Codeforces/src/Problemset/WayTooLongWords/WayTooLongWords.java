package Problemset.WayTooLongWords;
//problem: https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfLines= scanner.nextInt();

        for (int i = 1; i <= numOfLines; i++){
            String word = scanner.next();
            char firstChar = word.toCharArray()[0];
            char lastChar = word.toCharArray()[word.length()-1];
            int numOfLetters = word.length()-2;

            if (word.length()-1 < 10){
                System.out.println(word);
            } else {
                System.out.println(firstChar + "" + numOfLetters + "" + lastChar);
            }
        }

    }
}
