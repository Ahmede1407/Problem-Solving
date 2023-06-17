package Problemset.NextRound;
// problem: https://codeforces.com/problemset/problem/158/A

import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfParticipants = scanner.nextInt();
        int finishersPlace = scanner.nextInt();
        int [] scores = new int[numberOfParticipants];
        int numOfParticipantsToNextRound = 0;

        // initializing array of scores
        for (int i = 0; i < numberOfParticipants; i++) {
            scores[i] = scanner.nextInt();
        }

        // checking how many participants will pass to next round
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= scores[finishersPlace - 1] && scores[i] != 0){
                numOfParticipantsToNextRound++;
            }
        }
        System.out.println(numOfParticipantsToNextRound);

    }
}
