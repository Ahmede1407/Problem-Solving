package Problemset.AntonAndDanik;
// problem: https://codeforces.com/problemset/problem/734/A

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfGames = scanner.nextInt();
        String outcomeOfEachGame = scanner.next();

        int AntonsWins = 0;
        int DaniksWins = 0;

        for (int i = 0; i < numOfGames; i++) {
            if (outcomeOfEachGame.charAt(i) == 'A'){
                AntonsWins++;
            }else {
                DaniksWins++;
            }
        }

        if (AntonsWins>DaniksWins){
            System.out.println("Anton");
        } else if (DaniksWins>AntonsWins) {
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}
